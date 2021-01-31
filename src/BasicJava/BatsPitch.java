package BasicJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class BatsPitch {

	public static void main(String[] args) {
		List<String> list1 =new ArrayList<>();
		//Order-Symbol Map
		Map<String, String> orderSymbolMap = new HashMap<String, String>();
		Map<String, Integer> symbolMap = new HashMap<String, Integer>();
		Map<String, Integer> sortedTopTenMap = new LinkedHashMap<String, Integer>();

		try {
			File file =new File("pitch_example_data.txt");
			Scanner scan= new Scanner(file);
			while(scan.hasNextLine()){
				String data=scan.nextLine();
				if(data!=null&&data.length()>0) {
					if(data.length()==46) {
						//S28800318E1K27GA00000X00010000001AQ00001
						//String type=line.substring(9, 10);
						//String n_share=line.substring(23, 29);
						String order_id=data.substring(10, 22);
						String stock_symbol=data.substring(29, 35);
						if(!orderSymbolMap.containsKey(order_id)) {
							orderSymbolMap.put(order_id, stock_symbol);
						}
					}
					//else {
						list1.add(data);
					//}
				}
			}
			scan.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("error");
			e.printStackTrace();
		}


		if(list1!=null&& list1.size()>0) {
			//int count_open_order=0;		
			//int count_cancel_order=0;		
			
			for(int i=0;i<list1.size();i++) {
				String line= list1.get(i);
				String order_id="";
				int n_share=0;
				String stock_symbol = "";
				
				//executed order  - type "E"
				if((line.length()==40)&&(line.charAt(9)=='E')) {
					//String type=line.substring(9, 10);
					//String n_share=line.substring(22, 28);
					//E: S28800318 E 1K27GA00000X 000100 00001AQ00001
					//order id
					order_id=line.substring(10, 22);
					//number of share
					n_share=Integer.parseInt(line.substring(22, 28));
					//retrieving symbol name of the excuted order
					stock_symbol = getStockSymbol(order_id, orderSymbolMap);
					//System.out.println("Execute : share_symbol/Sahre_count: "+" : "+stock_symbol+" : "+n_share);
				}
				//Trade message order  - type "P"
				if((line.length()==57)&&(line.charAt(9)=='P')) {
					//S28803240 P 4K27GA00003P B 000100 DXD   0000499600000N4AQ00003
					//order id
					order_id=line.substring(10, 22);
					//number of share
					n_share=Integer.parseInt(line.substring(23, 29));
					//stock symbol
					stock_symbol=line.substring(29, 35);
					//System.out.println("Trade: share_symbol/Sahre_count: "+" : "+stock_symbol+" : "+n_share);
				}
				
				/*
				//open orders
				else if(line.length()==46) {
					//count_open_order++;
					//System.out.println(line);
					//S28800318E1K27GA00000X00010000001AQ00001
					//open order type "A"
					String type=line.substring(9, 10);
					//order id
					order_id=line.substring(10, 22);
					//number of share 'B' or 'S'
					n_share=Integer.parseInt(line.substring(23, 29));
					//stock symbol
					stock_symbol=line.substring(29, 35);
					//System.out.println(count_open_order+". share_symbol/Sahre_count: "+" : "+stock_symbol+" : "+n_share);
				}
				
				//can orders
				else if(line.length()==28) {
					count_cancel_order++;
					//open order type "X"
					String type=line.substring(9, 10);
					//order id
					order_id=line.substring(10, 22);
					//number of share
					n_share=Integer.parseInt(line.substring(22,28));
					//retrieving symbol name of the excuted order
					stock_symbol = getStockSymbol(order_id, orderSymbolMap);
					//System.out.println(count_cancel_order+". share_symbol/Sahre_count: "+" : "+stock_symbol+" : "+n_share);
				}
				*/
				else {
					//System.out.println("remaining: "+line);
				}
				if (stock_symbol!="") {
					if(symbolMap.containsKey(stock_symbol)) {
						n_share = n_share+symbolMap.get(stock_symbol);
					}
					symbolMap.put(stock_symbol, n_share);
				}
			}
			Set<Entry<String, Integer>> set = symbolMap.entrySet();
	        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
	        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
	            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
	                return o2.getValue().compareTo(o1.getValue());
	            }
	        });
	        int count=0;
	        for (Entry<String, Integer> entry : list) {
	        	count++;
	            String key = ((Map.Entry<String, Integer>) entry).getKey();
				Integer value = ((Map.Entry<String, Integer>) entry).getValue();
				sortedTopTenMap.put(key, value);
				if(count==10) {
					break;
				}
	        }
	        System.out.println(sortedTopTenMap);
            
	        /*
			Object[] a = symbolMap.entrySet().toArray();
			Arrays.sort(a, new Comparator() {
			    public int compare(Object o1, Object o2) {
			        return ((Map.Entry<String, Integer>) o2).getValue()
			                   .compareTo(((Map.Entry<String, Integer>) o1).getValue());
			    }
			});
			int count=0;
			for(Object element : a) {
				count++;
				String key = ((Map.Entry<String, Integer>) element).getKey();
				Integer value = ((Map.Entry<String, Integer>) element).getValue();
				sortedTopTenMap.put(key, value);
				if(count==10) {
					break;
				}
			}*/
		}
		else {
			System.out.println("No data in the file found");
		}
	}

	private static String getStockSymbol(String order_id, Map<String, String> orderSymbolMap) {
		String symbolName = orderSymbolMap.get(order_id);
		//System.out.println("Symbol name: "+symbolName);
		return symbolName;
	}
}
