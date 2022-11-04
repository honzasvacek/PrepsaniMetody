public abstract class Zvire {
    //metoda info
    //metody - muj druh muj pocet nohou
    public void info(){
        System.out.println("Druh: " + mujDruh());
        System.out.println("Trida: " + mojeTrida());
        System.out.println("Pocet nohou: " + mojeNohy());
    }
    public abstract String mujDruh();
    public abstract String mojeTrida();
    public abstract int mojeNohy();


}
