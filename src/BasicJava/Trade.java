package BasicJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Trade {

	public static void main(String[] args) {
		List<String> list1 =new ArrayList<>();
		List<String>add_order_list =new ArrayList<>();
		List<String> Cancel_order_list =new ArrayList<>();
		List<String>Execution_order_list =new ArrayList<>();
		List<String>Trade_order_list =new ArrayList<>();
		
		//
		Map<String, String> symbolMap = new HashMap<String, String>();
		//

		try {
			File file =new File("src/BasicJava/pitch_example_data.txt");
			Scanner scan= new Scanner(file);
			while(scan.hasNextLine()){
				String data=scan.nextLine();
				//System.out.println(data);
				if(data!=null&&data.length()>0) {
					if(data.length()==46) {
						//System.out.println(data);
						//S28800318E1K27GA00000X00010000001AQ00001
						//String type=line.substring(9, 10);
						//String n_share=line.substring(23, 29);
						String order_id=data.substring(10, 22);
						String stock_symbol=data.substring(29, 35);
						if(!symbolMap.containsKey(order_id)) {
							symbolMap.put(order_id, stock_symbol);
						}
					}
					else {
						list1.add(data);
					}
				}
				
				for (Entry<String, String> pp:symbolMap.entrySet()) {
					System.out.println(pp.getKey()+" / "+pp.getValue());
				}
			}

			//int s=list1.size();
			//System.out.println(s);
			scan.close();

		}
		catch(FileNotFoundException e) {
			System.out.println("error");
			e.printStackTrace();
		}


		if(list1!=null&& list1.size()>0) {
			/*
//E: execute l: 40
//X: cancel l: 28
//A: add order l: 46
P: trade message l: 57
			 */
			for(int i=0;i<list1.size();i++) {
				String line= list1.get(i);
				if((line.length()==40)&&(line.charAt(9)=='E')) {
					//String type=line.substring(9, 10);
					String order_id=line.substring(10, 22);
					getStockSymbol(order_id);
					//String n_share=line.substring(22, 28);
					//E: S28800318 E 1K27GA00000X 000100 00001AQ00001
					int n_share=Integer.parseInt(line.substring(22, 28));
					System.out.println("order_id/Sahre_count/share_symbol: "+" : "+order_id+" : "+n_share+ " : ");
					Execution_order_list.add(line);
				}

				else if(line.length()==57) {
					String type=line.substring(9, 10);
					String order_ID=line.substring(10, 22);
					//String n_share=line.substring(23, 29);
					//S28803240 P 4K27GA00003P B 000100 DXD   0000499600000N4AQ00003
					int n_share=Integer.parseInt(line.substring(23, 29));
					String n_symbol=line.substring(29, 35);
					/*System.out.println("type/order_id/Sahre_count/share_symbol: "+type+" : "
							+order_ID+" : "+n_share+ " : "+n_symbol);*/
					Trade_order_list.add(line);

				}
				else if(line.length()==46) {
					//System.out.println(line);
					//S28800318E1K27GA00000X00010000001AQ00001
					//String type=line.substring(9, 10);
					String order_id=line.substring(10, 22);
					//String n_share=line.substring(23, 29);
					int n_share=Integer.parseInt(line.substring(23, 29));
					String stock_symbol=line.substring(29, 35);
					/*System.out.println("type/order_id/Sahre_count/share_symbol: "+type+" : "
							+order_id+" : "+n_share+ " : "+n_symbol);*/
					add_order_list.add(line);
					//System.out.println("AAA" +add_order_list );
				}
				else if(line.length()==28) {
					String type=line.substring(9, 10);
					String order_ID=line.substring(10, 22);
					//String n_share=line.substring(22, 28);
					int n_share=Integer.parseInt(line.substring(22,28));
					/*System.out.println("type/order_id/Sahre_count/share_symbol: "+type+" : "
							+order_ID+" : "+n_share+ " : ");*/
					Cancel_order_list.add(line);

				}
				else {
					//System.out.println("remaining: "+line);
				}
				
			
				
			}
			
			
		}
		else {
			System.out.println("No data in the file found");
		}
	}

	private static void getStockSymbol(String order_id) {
		
		
	}
}
