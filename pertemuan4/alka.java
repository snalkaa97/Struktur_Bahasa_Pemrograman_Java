class enemy {
    String name;
    int hp;
    int attackPoin;
    // String ngomong;

    String attack(String ngomong){
       return ngomong;
    }
}

class zombie extends enemy{
    void walk(){
        System.out.println("Zombie jalan-jalan");
    }
}

class pocong extends enemy{
    void jump(){
        System.out.println("Pocong lompat-lompat");
    }
}

class burung extends enemy{
    void walk(){
        System.out.println("Burung berjalan");
    }
    void jump(){
        System.out.println("Burung loncat-loncat");
    }
    void fly(){
        System.out.println("Burung Terbang...");
    }
}

class alka{
    public static void main(String[] args) {
        enemy monster = new enemy();
        zombie zumbi = new zombie();
        pocong hantuPocong = new pocong();
        burung puyuh = new burung();

        zumbi.name = "Syahdan";
        hantuPocong.name = "Alka";
        puyuh.name = "Slamet";


        zumbi.hp = 1000;
        hantuPocong.hp=200;
        puyuh.hp = 500;


        zumbi.attackPoin=5000;
        hantuPocong.attackPoin=10000;
        puyuh.attackPoin=1000;

        // zumbi.ngomong="Juancok";
        System.out.println("Zombie:"+zumbi.attack("Juancok"));
        System.out.println("Pocong:"+hantuPocong.attack("Mumuuunn"));
        System.out.println("Burung:"+puyuh.attack("Buyung apatuh? buyung puyuhh..."));

    }
}
