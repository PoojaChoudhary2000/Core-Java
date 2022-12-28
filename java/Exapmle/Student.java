public class Student{

private String sn=null;
private String sa=null;
private int rn=0;
private int sc=0;
private double fee=0.0;

Student(){
}

Student(String sn, String sa){
this.sn=sn;
this.sa=sa;
}

Student(String sn, String sa, int rn){
this.sn=sn;
this.sa=sa;
this.rn=rn;
}

Student(String sn, String sa, int rn, int sc, double fee){
this.sn=sn;
this.sa=sa;
this.rn=rn;
this.sc=sc;
this.fee=fee;
}

}

