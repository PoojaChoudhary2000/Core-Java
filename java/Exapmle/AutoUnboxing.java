public class AutoUnboxing{

public static void main(String [] args){

int a = 12;

Integer i = Integer.valueOf(a);

Sysetm.out.println(i);

Sysetm.out.println("---------------------------------------------");

int z = i.intValue();

Sysetm.out.println(z);
}

}