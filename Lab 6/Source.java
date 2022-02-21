import java.util.*;
class Mobile{
    HashMap<String, ArrayList<String>> mobiles = new HashMap<>();
	public String addMobile(String company,String model) {
		ArrayList<String> list=null;
        if(mobiles.containsKey(company)) {
             list=mobiles.get(company);
		}
		else {
			list = new ArrayList<String>();
		}
		list.add(model);
		return "model successfully added";
	}
	public ArrayList<String> getModels(String company) {
		if(mobiles.containsKey(company)){
			return mobiles.get(company);
		}
		else {
			return "K3";
		}

	}
	public String buyMobile(String company,String model) {
		 if(mobiles.containsKey(company)) {
			 ArrayList<String> list=mobiles.get(company);
			 boolean b=false;
			 for(String s: list){
				 if(s.equals(model)) {
					 list.remove(s);
					 b=true;
					 break;
				 }
			 }
			 mobiles.put(company,list);
			 if(b)
			 return "mobile sold successfully";
			 else
			 return "item not available";

		 }
		 return "item not available";

	}
}

public class Source {
	public static void main(String args[] ) throws Exception {
		Mobile obj = new Mobile();
        //String res1= obj.addMobile("Oppo", "K3");
        //String res2 = obj.getModels("Oppo");
        //String res3 =obj.buyMobile("Oppo", "K3"); 
		System.out.println(obj.addMobile("Oppo", "K3")); 
		System.out.println(obj.getModels("Oppo")); 
		System.out.println(obj.buyMobile("Oppo", "K3"));             
	}
}