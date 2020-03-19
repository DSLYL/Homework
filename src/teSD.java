//package lesson1;

class PC{
    CPU cpu;
    HardDisk HD;
    void setCPU(CPU c) {
        cpu=c;
    }
    void setHardDisk(HardDisk h) {
        HD=h;
    }
    void show() {
        System.out.println(cpu.speed);
        System.out.println(HD.amount);
    }
}

class CPU{
    int speed;
    void setSpeed(int m) {
        speed=m;
    }
    int getSpeed() {
        return speed;
    }

}

class HardDisk{
    int amount;
    void setAmoutn(int m) {
        amount=m;
    }
    int getAmount() {
        return amount;
    }

}



public class teSD {
    public static void main(String[] args) {
        CPU cpu=new CPU();
        cpu.speed=2200;
        HardDisk disk= new HardDisk();
        disk.amount=200;
        PC pc = new PC();
        pc.setCPU(cpu);
        pc.setHardDisk(disk);
        pc.show();
    }

}
