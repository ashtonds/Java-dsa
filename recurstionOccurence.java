public class recurstionOccurence {

    public static int frst = -1;
    public static int last = -1;

    public static void Occurence(String str, int index, char element){
    
        if(index == str.length()){
            System.out.println(str);
            System.out.print("The element '"+ element + "' is found at starting index "+ frst + " in the end found at "+ last);
            return;
        }

        char currentCharecter = str.charAt(index);
        if(currentCharecter == element){
            if(frst == -1){
                frst = index;
            }
            else{
                last = index;
            }
        }
        Occurence(str, index+1, element);
        
    }

    public static void main(String[] args) {
    
    String str = "faanrfrnafejjak";
    Occurence(str,0,'a');


    }
}