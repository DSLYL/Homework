package com.lyl.test.One;
//组合简单使用
// 想象魔人布欧，吸收敌人后，可以把对方的技能占位己有

class Play{
    int a ;
    void ss(){
        System.out.println("哈哈哈 哈哈哈");
    }

}
class S1{
    Play p1 = new Play();

}
public class Test4 extends  Object{
    public static void main(String[] args) {
        S1 ss= new S1();
        ss.p1.ss();
    }
}
