
public class Family {

    public static void main(String[] args) {
        String[][] arr = {{"paari", "karikalan"}, 
        {"udhiran", "sendhan"}, 
        {"sendhan", "arulmozhi"},
        {"karikalan", "sendhan"},
        {"subramanian","mani"},{"mani","sub"}
        };
        System.out.println(family(arr,"sub"));
    }
    static int family(String[][] arr,String name){
        String child = name;
        int count = 0;
        while(!child.isEmpty()){
            boolean found = false;
            for(int i=  0;i<arr.length;i++){
                if(arr[i][1].equals(child)){
                    child = arr[i][0];
                    found = true;
                    count++;
                    break;
                }
            }
            if(found == false) break;
        }
        return count; 
    }
}
