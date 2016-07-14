package look;

/**
 * Created by s5761 on 2016/5/27.
 */
public class ioliu {
  /**
   * 单例模式，该类只允许有一个对象，因此对象的创立只能由本类来进行
   * 并将构造方法设置为private，使得其他类无法创建此类的对象
   * 有两种单例模式的实现方法。
   * 方法如下：
   * 实际应用中，饿汉式使用较多，因为饿汉式的代码量少，且是线程安全的。
   * 当然懒汉式也可以设计成线程安全的形式，但是相对于饿汉式来说，代码量大量增加
   */
  //单例模式：饿汉式
//  private  ioliu(){}
//  private static ioliu ioObject = new ioliu();
//  public static ioliu getInstance(){
//    return ioObject;
//  }


  // 懒汉式
  private ioliu(){}
  private static ioliu o=null;
  public static ioliu getInstance() {
    if (o==null){
      /**由于懒汉式的对象创立不是原子性的操作，有线程不安全性
       *所以在使用过程中需要加锁使得其保持线程安全
       */
      synchronized (ioliu.class) {
        if (o==null)
          o=new ioliu();
      }
    }
  return o;
  }
}
