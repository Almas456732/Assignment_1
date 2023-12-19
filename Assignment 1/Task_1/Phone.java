import java.io.Serializable;
public class Phone implements Serializable{
    private int number;
    private String model;
    private String weight;
    //Methods
    public void receiveCall(String name){
        System.out.println(name  + " is ringing");
    }
    public void receiveCall(String name,int number){
        System.out.println(name  + number);
    }

    public int getNumber(int Number){
        return Number;

    }
    public void sendMessage(int... phoneNumbers) {
        System.out.println("Sending a message to the following phone numbers:");

        // Iterate through the variable-length arguments (phone numbers)
        for (int phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }
    //constructors
    public Phone(int number ,String model,String weight){
        this(number, model);
        this.weight=weight;
    }
    public Phone(int number,String model){
        this.number=number;
        this.model=model;
    }
    public Phone(){

    }

    public static void main(String[] args){
        //instance 1
        Phone phone1=new Phone();
        phone1.number=111;
        phone1.model="Model A";
        phone1.weight="250 g";
        System.out.println("Phone1 "+phone1.number + " " + phone1.model +" "+ phone1.weight);

        //instance 2
        Phone phone2=new Phone();
        phone2.number=222;
        phone2.model="Model B";
        phone2.weight="355 g";
        System.out.println("Phone2 "+phone2.number + " " + phone2.model +" "+ phone2.weight);

        //instance 3
        Phone phone3=new Phone();
        phone3.number=333;
        phone3.model="Model C";
        phone3.weight="500 g";
        System.out.println("Phone3 "+phone3.number + " " + phone3.model +" "+ phone3.weight);

        //using methods
        Phone caller=new Phone();
        caller.receiveCall("Almas");
        caller.receiveCall("Almas",8708203);
        System.out.println(caller.getNumber(12345));
        caller.sendMessage(12345,3294,580252);
    }
}
/*System.out.println(name.number);
        System.out.println(name.model);
        System.out.println(name.weight);*/