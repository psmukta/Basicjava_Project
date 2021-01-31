package BasicJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class BatsPitchOutput {

	public static void main(String[] args) {
		List<String> pitchData =new ArrayList<>();
		Map<String, String> orderId_symbol_map = new HashMap<String, String>();
		Map<String, Integer> stockSymbol_nShare_map = new HashMap<String, Integer>();
		Map<String, Integer> sortedTopTenStockSymbol = new LinkedHashMap<String, Integer>();

		try {
			File file =new File("pitch_example_data.txt");
			Scanner scan= new Scanner(file);
			while(scan.hasNextLine()){
				String data=scan.nextLine();
				if(data!=null&&data.length()>0) {
					if(data.length()==46) {
						//String type=line.substring(9, 10);
						//String n_share=line.substring(23, 29);
						String order_id=data.substring(10, 22);
						String stock_symbol=data.substring(29, 35);
						if(!orderId_symbol_map.containsKey(order_id)) {
							orderId_symbol_map.put(order_id, stock_symbol);
						}
					}
					pitchData.add(data);
				}
			}
			scan.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("error");
			e.printStackTrace();
		}


		if(pitchData!=null&& pitchData.size()>0) {

			for(int i=0;i<pitchData.size();i++) {
				String line= pitchData.get(i);
				String order_id="";
				int n_share=0;
				String stock_symbol = "";

				//executed order  - type "E"
				if((line.length()==40)&&(line.charAt(9)=='E')) {
					//String type=line.substring(9, 10);
					//order id
					order_id=line.substring(10, 22);
					//number of share
					n_share=Integer.parseInt(line.substring(22, 28));
					//retrieving symbol name of the executed order
					stock_symbol = orderId_symbol_map.get(order_id);

				}
				//Trade message order  - type "P"
				else if((line.length()==57)&&(line.charAt(9)=='P')) {
					//order id
					order_id=line.substring(10, 22);
					//number of share
					n_share=Integer.parseInt(line.substring(23, 29));
					//stock symbol
					stock_symbol=line.substring(29, 35);
				}

				else {
					//System.out.println("remaining: "+line);
				}
				//calculate volume of stock by symbol
				if (stock_symbol!="") {
					if(stockSymbol_nShare_map.containsKey(stock_symbol)) {
						n_share = n_share+stockSymbol_nShare_map.get(stock_symbol);
					}
					stockSymbol_nShare_map.put(stock_symbol, n_share);
				}
			}
			Set<Entry<String, Integer>> set = stockSymbol_nShare_map.entrySet();
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
				sortedTopTenStockSymbol.put(key, value);
				if(count==10) {
					break;
				}
			}
			//System.out.println(sortedTopTenStockSymbol);
			Iterator<Map.Entry<String,Integer>> Itr= sortedTopTenStockSymbol.entrySet().iterator();
			while(Itr.hasNext()) {
				Map.Entry<String,Integer> entry=Itr.next();
				System.out.println(entry);
			}
		}
		else {
			System.out.println("No data in the file found");
		}
	}


}
