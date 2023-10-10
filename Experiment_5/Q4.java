class four extends Thread{
    public void run(){
        System.out.println("Table of 4: ");
        for(int i=1; i<=10; i++){
            System.out.println(4 + "*" + i + "=" + 4*i);
        }
    }
}

class five extends Thread{
    public void run(){
        System.out.println("Table of 5: ");
        for(int i=1; i<=10; i++){
            System.out.println(5 + "*" + i + "=" + 5*i);
        }
    }
}

class thirteen extends Thread{
    public void run(){
        System.out.println("Table of 13: ");
        for(int i=1; i<=10; i++){
            System.out.println(13 + "*" + i + "=" + 13*i);
        }
    }
}

class Q4{
    public static void main(String args[]){
        four t1 = new four();
        five t2 = new five();
        thirteen t3 = new thirteen();
        t1.start();
        t2.start();
        t3.start();
        }
}