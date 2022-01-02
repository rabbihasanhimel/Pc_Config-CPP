public class pc 
{ 
    public String gpu;
    public String cpu;
    public String mobo;
    public String disks;
    public String ram;

 public pc (String gpu, String cpu, String mobo, String disks, String ram){
     this.gpu=gpu;
     this.cpu=cpu;
     this.mobo=mobo;
     this.disks=disks;
     this.ram=ram;

 }
public void showInfo(){

    System.out.println("GPU: "+gpu);
    System.out.println("CPU: "+cpu);
    System.out.println("Motherboard: "+mobo);
    System.out.println("Disk Spec: "+disks);
    System.out.println("RAM: "+ram);
}
}