![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1732771966756-d6f054e7-399b-419d-a2e6-0aaa3a0221f0.png)

# 1.UML图
## 1.1 类图表示方法
<font style="color:rgb(51, 51, 51);">在UML类图中，类使用包含类名、属性(field) 和方法(method) 且带有分割线的矩形来表示，比如下图表示一个Employee类，它包含name,age和address这3个属性，以及work()方法。 </font>

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1731486347789-1de7d756-1626-4843-b560-4cab9a8ea1e5.png)

<font style="color:rgb(51, 51, 51);">属性/方法名称前加的加号和减号表示了这个属性/方法的可见性，UML类图中表示可见性的符号有三种：</font>

+ <font style="color:rgb(51, 51, 51);">+：表示public</font>
+ <font style="color:rgb(51, 51, 51);">-：表示private</font>
+ <font style="color:rgb(51, 51, 51);">#</font><font style="color:rgb(51, 51, 51);">：表示protected</font>

<font style="color:rgb(51, 51, 51);">属性的完整表示方式是： </font>**<font style="color:rgb(51, 51, 51);">可见性 名称 ：类型 [ = 缺省值]</font>**

<font style="color:rgb(51, 51, 51);">方法的完整表示方式是： </font>**<font style="color:rgb(51, 51, 51);">可见性 名称(参数列表) [ ： 返回类型]</font>**

## <font style="color:rgb(51, 51, 51);">1.2类与类之间关系的表示方式</font>
### 1.2.1关联关系
**1、单向关联**

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1731486572852-6033666e-84e7-47f6-997a-59eac430b517.png)

<font style="color:rgb(51, 51, 51);">上图表示每个顾客都有一个地址，这通过让Customer类持有一个类型为Address的成员变量类实现。</font>

**<font style="color:rgb(51, 51, 51);">2、双向关联</font>**

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1731486622599-d09d9ca1-ef11-43ca-81d7-cc31dc4d1803.png)

<font style="color:rgb(51, 51, 51);">上图中在Customer类中维护一个List<Product>，表示一个顾客可以购买多个商品；在Product类中维护一个Customer类型的成员变量表示这个产品被哪个顾客所购买。</font>

**<font style="color:rgb(51, 51, 51);">3、自关联</font>**

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1731486668243-cf09a05a-0603-4eeb-ba23-077cd0082f2a.png)

<font style="color:rgb(51, 51, 51);">上图的意思就是Node类包含类型为Node的成员变量，也就是“自己包含自己”。</font>

### <font style="color:rgb(51, 51, 51);">1.2.2 聚合关系</font>
<font style="color:rgb(51, 51, 51);">聚合关系是关联关系的一种，是强关联关系，是整体和部分之间的关系  
</font><font style="color:rgb(51, 51, 51);">聚合关系也是通过成员对象来实现的，其中成员对象是整体对象的一部分，但是成员对象可以脱离整体对象而独立存在。例如，学校与老师的关系，学校包含老师，但如果学校停办了，老师依然存在。</font>

<font style="color:rgb(51, 51, 51);">在 UML 类图中，聚合关系可以用带空心菱形的实线来表示，菱形指向整体。下图所示是大学和教师的关系图：</font>

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1731486915834-86ed09da-fa66-4663-b252-715c2357e1c1.png)

### 1.2.3 组合关系
<font style="color:rgb(51, 51, 51);">组合表示类之间的整体与部分的关系，但它是一种更强烈的聚合关系。</font>

<font style="color:rgb(51, 51, 51);">在 UML 类图中，组合关系用带实心菱形的实线来表示，菱形指向整体。下图所示是头和嘴的关系图：</font>

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1731486960217-fd1a5791-ea5b-4bde-aae0-af5666835e3a.png)

### 1.2.4 依赖关系
<font style="color:rgb(51, 51, 51);">依赖关系是一种使用关系，它是对象之间耦合度最弱的一种关联方式，是临时性的关联。在代码中，某个类的方法通过局部变量、方法的参数或者对静态方法的调用来访问另一个类（被依赖类）中的某些方法来完成一些职责。</font>

<font style="color:rgb(51, 51, 51);">在 UML 类图中，依赖关系使用带箭头的虚线来表示，箭头从使用类指向被依赖的类。下图所示是司机和汽车的关系图，司机驾驶汽车：</font>

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1731487023050-856310ab-9435-41e5-a5d2-60320f3dabc3.png)

### 1.2.5 继承（泛化）关系
<font style="color:rgb(51, 51, 51);">继承关系是对象之间耦合度最大的一种关系，表示一般与特殊的关系，是父类与子类之间的关系，是一种继承关系。</font>

<font style="color:rgb(51, 51, 51);">在 UML 类图中，泛化关系用带空心三角箭头的实线来表示，箭头从子类指向父类。在代码实现时，使用面向对象的继承机制来实现泛化关系。例如，Student 类和 Teacher 类都是 Person 类的子类，其类图如下图所示：</font>

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1731487073532-02312f3c-8126-41b4-8de9-a889a87a776e.png)

### 1.2.6 实现关系
<font style="color:rgb(51, 51, 51);">实现关系是接口与实现类之间的关系。在这种关系中，类实现了接口，类中的操作实现了接口中所声明的所有的抽象操作。</font>

<font style="color:rgb(51, 51, 51);">在 UML 类图中，实现关系使用带空心三角箭头的虚线来表示，箭头从实现类指向接口。例如，汽车和船实现了交通工具</font>

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1731487129512-c4969bdd-0047-4369-9137-b09dd2d58683.png)

# 2.软件设计原则
![画板](https://cdn.nlark.com/yuque/0/2024/jpeg/38663466/1731648195897-5dfa15a0-abab-4573-a279-990b5c8715b0.jpeg)

## 2.1开闭原则
**对拓展开放，对修改关闭：**对程序进行拓展时，不能去修改原有的代码，实现一个热插拔的效果。简言之，是为了使程序的拓展性好，已于维护和升级。

<font style="color:rgb(51, 51, 51);">想要达到这样的效果，我们需要使用接口和抽象类。</font>

<font style="color:rgb(51, 51, 51);">因为抽象灵活性好，适应性广，只要抽象的合理，可以基本保持软件架构的稳定。而软件中易变的细节可以从抽象派生来的实现类来进行扩展，当软件需要发生变化时，只需要根据需求重新派生一个实现类来扩展就可以了。</font>

`<font style="color:rgb(51, 51, 51);background-color:rgb(248, 248, 248);">搜狗输入法</font>`<font style="color:rgb(51, 51, 51);"> 的皮肤是输入法背景图片、窗口颜色和声音等元素的组合。用户可以根据自己的喜爱更换自己的输入法的皮肤，也可以从网上下载新的皮肤。这些皮肤有共同的特点，可以为其定义一个抽象类（AbstractSkin），而每个具体的皮肤（DefaultSpecificSkin和HeimaSpecificSkin）是其子类。用户窗体可以根据需要选择或者增加新的主题，而不需要修改原代码，所以它是满足开闭原则的。</font>

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1731573740454-a3257165-6373-4e53-880b-9f44f5555ea3.png)

## 2.1里氏替换原则
任何基类可以出现的地方，子类一定可以出现。

子类可以拓展父类的功能，但不能改变父类原有的功能。子类继承父类时，除添加indeed方法完成新功能外，尽量不要重写父类的方法。

<font style="color:rgb(51, 51, 51);">如果通过重写父类的方法来完成新的功能，这样写起来虽然简单，但是整个继承体系的可复用性会比较差，特别是运用多态比较频繁时，程序运行出错的概率会非常大。</font>

**<font style="color:rgb(51, 51, 51);">例</font>**<font style="color:rgb(51, 51, 51);"> 正方形不是长方形。</font>

<font style="color:rgb(51, 51, 51);">在数学领域里，正方形毫无疑问是长方形，它是一个长宽相等的长方形。所以，我们开发的一个与几何图形相关的软件系统，就可以顺理成章的让正方形继承自长方形。</font>

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1731573755927-193b8163-4427-4c94-afe7-0f0b3507a9cb.png)

<font style="color:rgb(51, 51, 51);">我们运行一下这段代码就会发现，假如我们把一个普通长方形作为参数传入resize方法，就会看到长方形宽度逐渐增长的效果，当宽度大于长度,代码就会停止，这种行为的结果符合我们的预期；假如我们再把一个正方形作为参数传入resize方法后，就会看到正方形的宽度和长度都在不断增长，代码会一直运行下去，直至系统产生溢出错误。所以，普通的长方形是适合这段代码的，正方形不适合。我们得出结论：在resize方法中，Rectangle类型的参数是不能被Square类型的参数所代替，如果进行了替换就得不到预期结果。因此，Square类和Rectangle类之间的继承关系违反了里氏代换原则，它们之间的继承关系不成立，正方形不是长方形。</font>

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1731573774923-38a2df23-4d41-40d6-9f7f-4900f84ff593.png)

## 2.3依赖倒转原则
高层模块不应该依赖底层模块，两者都应该以来抽象；抽象不应该依赖细节，细节应该依赖抽象。简单的说要求对抽象进行编程，不要对是西安进行编程，这样降低了客户与是实现模块间的耦合。

<font style="color:rgb(51, 51, 51);">例 组装电脑</font>

<font style="color:rgb(51, 51, 51);">现要组装一台电脑，需要配件cpu，硬盘，内存条。只有这些配置都有了，计算机才能正常的运行。选择cpu有很多选择，如Intel，AMD等，硬盘可以选择希捷，西数等，内存条可以选择金士顿，海盗船等。</font>

**<font style="color:rgb(51, 51, 51);">类图如下：</font>**

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1731573804648-620c8017-35db-48ed-9c81-4ddeb49cf4c3.png)

<font style="color:rgb(51, 51, 51);">根据依赖倒转原则进行改进：</font>

<font style="color:rgb(51, 51, 51);">代码我们只需要修改Computer类，让Computer类依赖抽象（各个配件的接口），而不是依赖于各个组件具体的实现类。</font>

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1731574190406-3f749ffc-4fc2-49bb-bf73-54e1598d392c.png)

## 2.4接口隔离原则
客户端不应该被迫依赖于它不使用的方法；一个类对另一个类的依赖应该简历在最小的接口上。

<font style="color:rgb(51, 51, 51);">我们需要创建一个</font>`<font style="color:rgb(51, 51, 51);background-color:rgb(248, 248, 248);">黑马</font>`<font style="color:rgb(51, 51, 51);">品牌的安全门，该安全门具有防火、防水、防盗的功能。可以将防火，防水，防盗功能提取成一个接口，形成一套规范。类图如下：</font>

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1731574761736-5eec7bd4-62af-4459-8344-e325059b29b5.png)

<font style="color:rgb(51, 51, 51);">上面的设计我们发现了它存在的问题，黑马品牌的安全门具有防盗，防水，防火的功能。现在如果我们还需要再创建一个传智品牌的安全门，而该安全门只具有防盗、防水功能呢？很显然如果实现SafetyDoor接口就违背了接口隔离原则，那么我们如何进行修改呢？看如下类图：</font>

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1731574817143-34e991e8-a31c-45a7-8b44-f0a83d59dd0c.png)

## 2.5迪米特法则
最少知识原则

<font style="color:rgb(51, 51, 51);">只和你的直接朋友交谈，不跟“陌生人”说话（Talk only to your immediate friends and not to strangers）。</font>

> 联想组件之间的通讯
>

<font style="color:rgb(51, 51, 51);">其含义是：如果两个软件实体无须直接通信，那么就不应当发生直接的相互调用，可以通过第三方转发该调用。其目的是降低类之间的耦合度，提高模块的相对独立性。</font>

<font style="color:rgb(51, 51, 51);">【例】明星与经纪人的关系实例</font>

<font style="color:rgb(51, 51, 51);">明星由于全身心投入艺术，所以许多日常事务由经纪人负责处理，如和粉丝的见面会，和媒体公司的业务洽淡等。这里的经纪人是明星的朋友，而粉丝和媒体公司是陌生人，所以适合使用迪米特法则。</font>

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1731575135688-dc5c781e-7fd5-43ac-9996-dc2c95b7e468.png)

## 2.6合成复用原则
尽量先使用组合或者聚合等关联关系来实现，其次才考虑使用继承关系来实现

<font style="color:rgb(51, 51, 51);">继承复用虽然有简单和易实现的优点，但它也存在以下缺点：</font>

1. <font style="color:rgb(51, 51, 51);">继承复用破坏了类的封装性。因为继承会将父类的实现细节暴露给子类，父类对子类是透明的，所以这种复用又称为“白箱”复用。</font>
2. <font style="color:rgb(51, 51, 51);">子类与父类的耦合度高。父类的实现的任何改变都会导致子类的实现发生变化，这不利于类的扩展与维护。</font>
3. <font style="color:rgb(51, 51, 51);">它限制了复用的灵活性。从父类继承而来的实现是静态的，在编译时已经定义，所以在运行时不可能发生变化。</font>

<font style="color:rgb(51, 51, 51);">采用组合或聚合复用时，可以将已有对象纳入新对象中，使之成为新对象的一部分，新对象可以调用已有对象的功能，它有以下优点：</font>

1. <font style="color:rgb(51, 51, 51);">它维持了类的封装性。因为成分对象的内部细节是新对象看不见的，所以这种复用又称为“黑箱”复用。</font>
2. <font style="color:rgb(51, 51, 51);">对象间的耦合度低。可以在类的成员位置声明抽象。</font>
3. <font style="color:rgb(51, 51, 51);">复用的灵活性高。这种复用可以在运行时动态进行，新对象可以动态地引用与成分对象类型相同的对象。</font>

<font style="color:rgb(51, 51, 51);">【例】汽车分类管理程序</font>

<font style="color:rgb(51, 51, 51);">汽车按“动力源”划分可分为汽油汽车、电动汽车等；按“颜色”划分可分为白色汽车、黑色汽车和红色汽车等。如果同时考虑这两种分类，其组合就很多。类图如下： </font>

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1731575458799-02b0dc6a-8689-42b9-8660-48a2159de5da.png)

<font style="color:rgb(51, 51, 51);">从上面类图我们可以看到使用继承复用产生了很多子类，如果现在又有新的动力源或者新的颜色的话，就需要再定义新的类。我们试着将继承复用改为聚合复用看一下。</font>

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1731575466122-11e6f9af-e10b-4d4b-ae36-1e737864a8af.png)

# 3.创建者模式
## 3.1单例设计模式
<font style="color:rgb(51, 51, 51);">单例模式（Singleton Pattern）是 Java 中最简单的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。</font>

<font style="color:rgb(51, 51, 51);">这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。</font>

### <font style="color:rgb(51, 51, 51);">3.1.1 单例模式的结构</font>
单例模式的主要有以下角色：

+ 单例类，只能创建一个实例的类
+ 访问类，使用单例类

### <font style="color:rgb(51, 51, 51);">3.1.2单例模式的实现</font>
单例设计模式：

1. 饿汉式：类加载就会导致该单例对象被创建
2. 饿汉式：类加载不会导致该单例对象被创建，而是首次使用该对象时才会被创建



1.饿汉式-方式1(静态变量方式)

```java
public class Singleton {
    private Singleton(){}

    private static Singleton instance = new Singleton();

    // 对外提供访问方法
    public static Singleton getSingleton() {
        return instance;
    }
    
}
```

> <font style="color:rgb(51, 51, 51);">该方式在成员位置声明Singleton类型的静态变量，并创建Singleton类的对象instance。instance对象是随着类的加载而创建的。如果该对象足够大的话，而一直没有使用就会造成内存的浪费。</font>
>

<font style="color:rgb(51, 51, 51);">2.饿汉式-方式2（静态代码块）</font>

```java
public class Singleton{
    private Singleton() {}
    private static Singleton instance;
    static {
        instance = new Singleton();
    }
    public static Singleton getSingleton() {
        return instance;
    } 
}
```

> <font style="color:rgb(51, 51, 51);">该方式在成员位置声明Singleton类型的静态变量，而对象的创建是在静态代码块中，也是对着类的加载而创建。所以和饿汉式的方式1基本上一样，当然该方式也存在内存浪费问题。</font>
>

<font style="color:rgb(51, 51, 51);">3.懒汉式-方式1 （线程不安全）</font>

```java
public class Singleton {
    private Singleton() {}
    private static Singleton instance;
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

> <font style="color:rgb(51, 51, 51);">从上面代码我们可以看出该方式在成员位置声明Singleton类型的静态变量，并没有进行对象的赋值操作，那么什么时候赋值的呢？当调用getInstance()方法获取Singleton类的对象的时候才创建Singleton类的对象，这样就实现了懒加载的效果。但是，如果是多线程环境，会出现线程安全问题。</font>
>

<font style="color:rgb(51, 51, 51);">4.饿汉式-方式2(线程安全)</font>

```java
public class Singleton {
    private Singleton() {}
    private static Singleton instance;
    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

> <font style="color:rgb(51, 51, 51);">该方式也实现了懒加载效果，同时又解决了线程安全问题。但是在getInstance()方法上添加了synchronized关键字，导致该方法的执行效果特别低。从上面代码我们可以看出，其实就是在初始化instance的时候才会出现线程安全问题，一旦初始化完成就不存在了。</font>
>

5.饿汉式-方式3(双重检查锁)

<font style="color:rgb(51, 51, 51);">再来讨论一下懒汉模式中加锁的问题，对于 </font>`<font style="color:rgb(51, 51, 51);background-color:rgb(248, 248, 248);">getInstance()</font>`<font style="color:rgb(51, 51, 51);"> 方法来说，绝大部分的操作都是读操作，读操作是线程安全的，所以我们没必让每个线程必须持有锁才能调用该方法，我们需要调整加锁的时机。由此也产生了一种新的实现模式：双重检查锁模式</font>

```java
public class Singleton {
    private Singleton() {}
    private static Singleton singleton;

    public static Singleton getInstance() {
        //第一次判断，如果instance不为null，不进入抢锁阶段，直接返回实例
        if(instance == null) {
            synchronized(Singleton.class) {
                // 抢到锁之后再次判断是否为null
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
    }
}
```

> <font style="color:rgb(51, 51, 51);">双重检查锁模式是一种非常好的单例实现模式，解决了单例、性能、线程安全问题，上面的双重检测锁模式看上去完美无缺，其实是存在问题，在多线程的情况下，可能会出现空指针问题，出现问题的原因是JVM在实例化对象的时候会进行优化和指令重排序操作。</font>
>

<font style="color:rgb(51, 51, 51);">要解决双重检查锁模式带来空指针异常的问题，只需要使用 </font>`<font style="color:rgb(51, 51, 51);background-color:rgb(248, 248, 248);">volatile</font>`<font style="color:rgb(51, 51, 51);"> 关键字, </font>`<font style="color:rgb(51, 51, 51);background-color:rgb(248, 248, 248);">volatile</font>`<font style="color:rgb(51, 51, 51);"> 关键字可以保证可见性和有序性。</font>

`<font style="color:rgb(51, 51, 51);background-color:rgb(248, 248, 248);">volatile</font>`<font style="color:rgb(51, 51, 51);"> 关键字详解：</font>

[https://blog.csdn.net/JMW1407/article/details/122302803](https://blog.csdn.net/JMW1407/article/details/122302803)

```java
public class Singleton {
    private Singleton() {}
    private static volatile Singleton singleton;

    public static Singleton getInstance() {
        //第一次判断，如果instance不为null，不进入抢锁阶段，直接返回实例
        if(instance == null) {
            synchronized(Singleton.class) {
                // 抢到锁之后再次判断是否为null
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
    }
}
```

6.饿汉式-方式4（静态内部类）

```java
public class Singleton {
    private Singleton() {}
    private static volatile Singleton singleton;

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
```

第一次加载Singleton类时不会去初始化INSTANCE，只有第一次调用getInstance，虚拟机加载SingletonHolder并初始化INSTANCE，这样不仅能确保线程安全，也能保证Singleton类的唯一性

**小结**

<font style="color:rgb(51, 51, 51);">静态内部类单例模式是一种优秀的单例模式，是开源项目中比较常用的一种单例模式。在没有加任何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费。</font>

<font style="color:rgb(51, 51, 51);">7.枚举方式</font>

<font style="color:rgb(51, 51, 51);">枚举类实现单例模式是极力推荐的单例实现模式，因为枚举类型是线程安全的，并且只会装载一次，设计者充分的利用了枚举的这个特性来实现单例模式，枚举的写法非常简单，而且枚举类型是所用单例实现中唯一一种不会被破坏的单例实现模式。</font>

```java
/**
 * 枚举方式
 */
public enum Singleton {
    INSTANCE;
}
```

### 3.1.3 存在问题
#### 3.1.3.1问题演示
使上面定义的单例类可以创建多个对象，枚举方式除外。有两种方式，分别是序列化和反射。

+ 序列化反序列化

**Singleton类:**

```java
public class Singleton implements Serializable {

    //私有构造方法
    private Singleton() {}

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    //对外提供静态方法获取该对象
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
```

**Test类：**

```java
public class Test {
    public static void main(String[] args) throws Exception {
        //往文件中写对象
        //writeObject2File();
        //从文件中读取对象
        Singleton s1 = readObjectFromFile();
        Singleton s2 = readObjectFromFile();

        //判断两个反序列化后的对象是否是同一个对象
        System.out.println(s1 == s2);
    }

    private static Singleton readObjectFromFile() throws Exception {
        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Think\\Desktop\\a.txt"));
        //第一个读取Singleton对象
        Singleton instance = (Singleton) ois.readObject();

        return instance;
    }

    public static void writeObject2File() throws Exception {
        //获取Singleton类的对象
        Singleton instance = Singleton.getInstance();
        //创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Think\\Desktop\\a.txt"));
        //将instance对象写出到文件中
        oos.writeObject(instance);
    }
}
```

<font style="color:rgb(119, 119, 119);">上面代码运行结果是</font>`<font style="color:rgb(119, 119, 119);background-color:rgb(248, 248, 248);">false</font>`<font style="color:rgb(119, 119, 119);">，表明序列化和反序列化已经破坏了单例设计模式。</font>

+ 反射

```java
public class Singleton {

    //私有构造方法
    private Singleton() {}
    
    private static volatile Singleton instance;

    //对外提供静态方法获取该对象
    public static Singleton getInstance() {

        if(instance != null) {
            return instance;
        }

        synchronized (Singleton.class) {
            if(instance != null) {
                return instance;
            }
            instance = new Singleton();
            return instance;
        }
    }
}
```

**Test类：**

```java
public class Test {
    public static void main(String[] args) throws Exception {
        //获取Singleton类的字节码对象
        Class clazz = Singleton.class;
        //获取Singleton类的私有无参构造方法对象
        Constructor constructor = clazz.getDeclaredConstructor();
        //取消访问检查
        constructor.setAccessible(true);

        //创建Singleton类的对象s1
        Singleton s1 = (Singleton) constructor.newInstance();
        //创建Singleton类的对象s2
        Singleton s2 = (Singleton) constructor.newInstance();

        //判断通过反射创建的两个Singleton对象是否是同一个对象
        System.out.println(s1 == s2);
    }
}
```

#### 3.1.3.2问题解决
<font style="color:rgb(51, 51, 51);">序列化、反序列方式破坏单例模式的解决方法</font>

<font style="color:rgb(51, 51, 51);">在Singleton类中添加</font>`<font style="color:rgb(51, 51, 51);background-color:rgb(248, 248, 248);">readResolve()</font>`<font style="color:rgb(51, 51, 51);">方法，在反序列化时被反射调用，如果定义了这个方法，就返回这个方法的值，如果没有定义，则返回新new出来的对象。</font>

```java
public class Singleton implements Serializable {

    //私有构造方法
    private Singleton() {}

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    //对外提供静态方法获取该对象
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
```

**源码解析：**

```java
public final Object readObject() throws IOException, ClassNotFoundException{
    ...
    // if nested read, passHandle contains handle of enclosing object
    int outerHandle = passHandle;
    try {
        Object obj = readObject0(false);//重点查看readObject0方法
    .....
}
    
private Object readObject0(boolean unshared) throws IOException {
	...
    try {
		switch (tc) {
			...
			case TC_OBJECT:
				return checkResolve(readOrdinaryObject(unshared));//重点查看readOrdinaryObject方法
			...
        }
    } finally {
        depth--;
        bin.setBlockDataMode(oldMode);
    }    
}
    
private Object readOrdinaryObject(boolean unshared) throws IOException {
	...
	//isInstantiable 返回true，执行 desc.newInstance()，通过反射创建新的单例类，
    obj = desc.isInstantiable() ? desc.newInstance() : null; 
    ...
    // 在Singleton类中添加 readResolve 方法后 desc.hasReadResolveMethod() 方法执行结果为true
    if (obj != null && handles.lookupException(passHandle) == null && desc.hasReadResolveMethod()) {
    	// 通过反射调用 Singleton 类中的 readResolve 方法，将返回值赋值给rep变量
    	// 这样多次调用ObjectInputStream类中的readObject方法，继而就会调用我们定义的readResolve方法，所以返回的是同一个对象。
    	Object rep = desc.invokeReadResolve(obj);
     	...
    }
    return obj;
}
```

+ 反射方式破解单例的解决方法

```java
public class Singleton {

    //私有构造方法
    private Singleton() {
        if(instance != null) {
            throw new RuntimeException();
        }
    }
    
    private static volatile Singleton instance;

    //对外提供静态方法获取该对象
    public static Singleton getInstance() {

        if(instance != null) {
            return instance;
        }

        synchronized (Singleton.class) {
            if(instance != null) {
                return instance;
            }
            instance = new Singleton();
            return instance;
        }
    }
}
```

<font style="color:rgb(51, 51, 51);">这种方式比较好理解。当通过反射方式调用构造方法进行创建创建时，直接抛异常。不运行此中操作。</font>

### <font style="color:rgb(51, 51, 51);">3.1.4 JDK源码解析-Runtime类</font>
<font style="color:rgb(51, 51, 51);">Runtime类就是使用的单例设计模式。</font>

```java
public class Runtime {
    private static Runtime currentRuntime = new Runtime();

    /**
     * Returns the runtime object associated with the current Java application.
     * Most of the methods of class <code>Runtime</code> are instance
     * methods and must be invoked with respect to the current runtime object.
     *
     * @return  the <code>Runtime</code> object associated with the current
     *          Java application.
     */
    public static Runtime getRuntime() {
        return currentRuntime;
    }

    /** Don't let anyone else instantiate this class */
    private Runtime() {}
    ...
}
```

<font style="color:rgb(51, 51, 51);">从上面源代码中可以看出Runtime类使用的是恶汉式（静态属性）方式来实现单例模式的。</font>

## <font style="color:rgb(51, 51, 51);">3.2 工厂模式</font>
### 3.2.1概述
<font style="color:rgb(51, 51, 51);">需求：设计一个咖啡店点餐系统。</font>

<font style="color:rgb(51, 51, 51);">设计一个咖啡类（Coffee），并定义其两个子类（美式咖啡【AmericanCoffee】和拿铁咖啡【LatteCoffee】）；再设计一个咖啡店类（CoffeeStore），咖啡店具有点咖啡的功能。</font>

<font style="color:rgb(51, 51, 51);">具体类的设计如下：</font>

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1732004213537-12ece732-e0e4-4bf7-a7f7-f1aa90aebb7f.png)

该设计违背了开闭原则

使用工厂模式生产对象，只需要和工厂打交道就可以，彻底和对象解耦，如果需要换对象直接在工厂里面更换对象即可，到达了对象解耦的目的，所以所，钢厂模式最大的优点就是**解耦**

### 3.2.2简单工厂模式
#### 3.2.2.1结构
+ 抽象产品：定义了产品的规范，描述产品的主要特性和功能
+ 具体产品：实现或继承抽象产品的子类
+ 具体工厂：提供了创建产品的方法，调用通过该方法来获取产品

#### 4.2.2.2实现
![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1732004633073-b1da91ef-bcc5-4d9e-a226-699cceb9a57b.png)

> 备注： 这个图有问题 工厂代码写错了
>

<font style="color:rgb(51, 51, 51);">工厂类代码：</font>

```java
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if("americano".equals(type)) {
            coffee = new AmericanoCoffee();
        } else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        }
        return coffee;
    }
}
```

<font style="color:rgb(51, 51, 51);">工厂（factory）处理创建对象的细节，一旦有了SimpleCoffeeFactory，CoffeeStore类中的orderCoffee()就变成此对象的客户，后期如果需要Coffee对象直接从工厂中获取即可。这样也就解除了和Coffee实现类的耦合，同时又产生了新的耦合，CoffeeStore对象和SimpleCoffeeFactory工厂对象的耦合，工厂对象和商品对象的耦合。</font>

<font style="color:rgb(51, 51, 51);">后期如果再加新品种的咖啡，我们势必要需求修改SimpleCoffeeFactory的代码，违反了开闭原则。工厂类的客户端可能有很多，比如创建美团外卖等，这样只需要修改工厂类的代码，省去其他的修改操作。</font>

#### <font style="color:rgb(51, 51, 51);">3.2.2.4 优缺点</font>
**优点：**

<font style="color:rgb(51, 51, 51);">封装了创建对象的过程，可以通过参数直接获取对象。把对象的创建和业务逻辑层分开，这样以后就避免了修改客户代码，如果要实现新产品直接修改工厂类，而不需要在原代码中修改，这样就降低了客户代码修改的可能性，更加容易扩展。</font>

> 不需要修改客户端代码，拓展只需要修改简单工厂代码
>

**缺点：**

<font style="color:rgb(51, 51, 51);">增加新产品时还是需要修改工厂类的代码，违背了“开闭原则”。</font>

#### <font style="color:rgb(51, 51, 51);">3.2.2.3拓展</font>
**静态工厂**

<font style="color:rgb(51, 51, 51);">在开发中也有一部分人将工厂类中的创建对象的功能定义为静态的，这个就是静态工厂模式，它也不是23种设计模式中的。代码如下：</font>

```java
public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if("americano".equals(type)) {
            coffee = new AmericanoCoffee();
        } else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        }
        return coffe;
    }
}
```

### 3.2.4工厂方法模式
<font style="color:rgb(51, 51, 51);">针对上例中的缺点，使用工厂方法模式就可以完美的解决，完全遵循开闭原则。</font>

#### <font style="color:rgb(51, 51, 51);">3.2.3.1概念</font>
定义一个用于创建对象的接口，让子类决定实例化哪个产品对象。工厂方法使一个产品的实话延迟到其工厂的子类。

#### 3.2.3.2结构
+ <font style="color:rgb(51, 51, 51);">抽象工厂（Abstract Factory）：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法来创建产品。</font>
+ <font style="color:rgb(51, 51, 51);">具体工厂（ConcreteFactory）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。</font>
+ <font style="color:rgb(51, 51, 51);">抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能。</font>
+ <font style="color:rgb(51, 51, 51);">具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应。</font>

#### 3.2.3.3实现
![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1732005680023-cff065d2-2198-4bdf-b440-9088571874e9.png)

抽象工厂：

```java
public interface CoffeeFactory {

    Coffee createCoffee();
}
```

具体工厂：

```java
public class LatteCoffeeFactory implements CoffeeFactory {

    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}

public class AmericanCoffeeFactory implements CoffeeFactory {

    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
```

咖啡店类：

```java
public class CoffeeStore {

    private CoffeeFactory factory;

    public CoffeeStore(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee(String type) {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}
```

<font style="color:rgb(51, 51, 51);">从以上的编写的代码可以看到，要增加产品类时也要相应地增加工厂类，不需要修改工厂类的代码了，这样就解决了简单工厂模式的缺点。</font>

<font style="color:rgb(51, 51, 51);">工厂方法模式是简单工厂模式的进一步抽象。由于使用了多态性，工厂方法模式保持了简单工厂模式的优点，而且克服了它的缺点。</font>

> 增加产品 就增加工厂 
>

#### 3.2.3.4优缺点
**优点：**

+ 用户只需要直到具体工厂的名称就可以得到想要的产品，无须知道产品的具体创建过程
+ 在系统增加产品时只需要添加具体产品类和对应的具体工厂类，无须对原工厂进行任何修改，满足开闭原则。

**缺点：**

+ <font style="color:rgb(51, 51, 51);">每增加一个产品就要增加一个具体产品类和一个对应的具体工厂类，这增加了系统的复杂度。</font>

### 3.2.4 抽象工厂模式
<font style="color:rgb(51, 51, 51);">抽象工厂模式将考虑多等级产品的生产，将同一个具体工厂所生产的位于不同等级的一组产品称为一个产品族。</font>

#### <font style="color:rgb(51, 51, 51);">3.2.4.1概念</font>
<font style="color:rgb(51, 51, 51);">是一种为访问类提供一个创建一组相关或相互依赖对象的接口，且访问类无须指定所要产品的具体类就能得到同族的不同等级的产品的模式结构。</font>

<font style="color:rgb(51, 51, 51);">抽象工厂模式是工厂方法模式的升级版本，工厂方法模式只生产一个等级的产品，而抽象工厂模式可生产多个等级的产品。</font>

#### <font style="color:rgb(51, 51, 51);">3.2.4.2结构</font>
抽象工厂模式的主要角色如下：

+ <font style="color:rgb(51, 51, 51);">抽象工厂（Abstract Factory）：提供了创建产品的接口，它包含多个创建产品的方法，可以创建多个不同等级的产品。</font>
+ <font style="color:rgb(51, 51, 51);">具体工厂（Concrete Factory）：主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建。</font>
+ <font style="color:rgb(51, 51, 51);">抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品。</font>
+ <font style="color:rgb(51, 51, 51);">具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它 同具体工厂之间是多对一的关系。</font>

#### 3.2.4.2 实现
<font style="color:rgb(51, 51, 51);">现咖啡店业务发生改变，不仅要生产咖啡还要生产甜点，如提拉米苏、抹茶慕斯等，要是按照工厂方法模式，需要定义提拉米苏类、抹茶慕斯类、提拉米苏工厂、抹茶慕斯工厂、甜点工厂类，很容易发生类爆炸情况。其中拿铁咖啡、美式咖啡是一个产品等级，都是咖啡；提拉米苏、抹茶慕斯也是一个产品等级；拿铁咖啡和提拉米苏是同一产品族（也就是都属于意大利风味），美式咖啡和抹茶慕斯是同一产品族（也就是都属于美式风味）。所以这个案例可以使用抽象工厂模式实现。类图如下：</font>

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1732006457900-6818ba07-c5d1-4b17-ad98-8627b1ec8c43.png)

抽象工厂：

```java
public interface DessertFactory {

    Coffee createCoffee();

    Dessert createDessert();
}
```

具体工厂：

```java
//美式甜点工厂
public class AmericanDessertFactory implements DessertFactory {

    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
//意大利风味甜点工厂
public class ItalyDessertFactory implements DessertFactory {

    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    public Dessert createDessert() {
        return new Tiramisu();
    }
}
```

<font style="color:rgb(51, 51, 51);">如果要加同一个产品族的话，只需要再加一个对应的工厂类即可，不需要修改其他的类。</font>

#### <font style="color:rgb(51, 51, 51);">3.2.4.3优缺点</font>
**优点：**

<font style="color:rgb(51, 51, 51);">当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。</font>

**<font style="color:rgb(51, 51, 51);">缺点：</font>**

#### <font style="color:rgb(51, 51, 51);">3.2.4.4使用场景</font>
+ <font style="color:rgb(51, 51, 51);">当需要创建的对象是一系列相互关联或相互依赖的产品族时，如电器工厂中的电视机、洗衣机、空调等。</font>
+ <font style="color:rgb(51, 51, 51);">系统中有多个产品族，但每次只使用其中的某一族产品。如有人只喜欢穿某一个品牌的衣服和鞋。</font>
+ <font style="color:rgb(51, 51, 51);">系统中提供了产品的类库，且所有产品的接口相同，客户端不依赖产品实例的创建细节和内部结构。</font>

<font style="color:rgb(51, 51, 51);">如：输入法换皮肤，一整套一起换。生成不同操作系统的程序。</font>

### <font style="color:rgb(51, 51, 51);">3.2.5模式拓展</font>
**简单工厂+配置文件接触耦合**

<font style="color:rgb(51, 51, 51);">可以通过工厂模式+配置文件的方式解除工厂对象和产品对象的耦合。在工厂类中加载配置文件中的全类名，并创建对象进行存储，客户端如果需要对象，直接进行获取即可。</font>

<font style="color:rgb(51, 51, 51);">第一步：定义配置文件</font>

<font style="color:rgb(51, 51, 51);">为了演示方便，我们使用properties文件作为配置文件，名称为bean.properties</font>

```properties
american=com.leo.pattern.factory.config_factory.AmericanCoffee
latte=com.leo.pattern.factory.config_factory.LatteCoffee
```

<font style="color:rgb(51, 51, 51);">第二步：改进工厂类</font>

```java
package com.leo.pattern.factory.config_factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author leijiong
 * @version 1.0
 */
public class CoffeeFactory {

    private static Map<String, Coffee> map = new HashMap<>();

    static {
        Properties p = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            System.out.println(is);
            p.load(is);
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                String className = p.getProperty((String) key);
                Class clazz = Class.forName(className);
                Coffee obj = (Coffee) clazz.newInstance();
                map.put((String) key, obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Coffee createCoffee(String type) {
       return map.get(type);
    }
}

```

### 3.2.6 JDK源码解析-Collection.iterator方法
```java
public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("令狐冲");
        list.add("风清扬");
        list.add("任我行");

        //获取迭代器对象
        Iterator<String> it = list.iterator();
        //使用迭代器遍历
        while(it.hasNext()) {
            String ele = it.next();
            System.out.println(ele);
        }
    }
}
```

单列集合获取迭代器的方法就使用到了工厂方法模式

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1732169066435-ce98ca92-87ad-4fa9-912e-66a17b242e43.png)

<font style="color:rgb(51, 51, 51);">Collection接口是抽象工厂类，ArrayList是具体的工厂类；Iterator接口是抽象商品类，ArrayList类中的Iter内部类是具体的商品类。在具体的工厂类中iterator()方法创建具体的商品类的对象。</font>

> <font style="color:rgb(119, 119, 119);">1,DateForamt类中的getInstance()方法使用的是工厂模式；</font>
>
> <font style="color:rgb(119, 119, 119);">2,Calendar类中的getInstance()方法使用的是工厂模式；</font>
>

## 3.3原型模式
### 3.3.1概述
<font style="color:rgb(51, 51, 51);">用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型对象相同的新对象。</font>

### <font style="color:rgb(51, 51, 51);">3.3.2结构</font>
原型模式包含如下角色：

+ 抽象原型类：规定了具体原型对象必须实现的clone()方法
+ 具体原型类：实现抽象原型的clone()方法，它是可被复制的对象
+ 访问类：使用具体原型类中的clone()方法来复制新的对象

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1732169871200-96b7e9f3-626d-45ce-a0f1-5f01392670c9.png)

### 3.3.3实现
原型模式的克隆分为浅克隆和深克隆。

浅克隆：

> 创建一个新对象，新对象的属性和原来对象完全相同，对于分基本类型属性，仍指向原有属性所指向的对象的内存地址。
>

深克隆：

> 创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址
>

java中的Object提供了clone()方法来实现浅拷贝。Cloneable接口时上面类图中的抽象原型类，而实现了Cloneable接口的子类实现类就是具体的原型类。

**<font style="color:rgb(51, 51, 51);">Realizetype（具体的原型类）：</font>**

```java
package com.leo.pattern.prototype.demo;

/**
 * @author leijiong
 * @version 1.0
 */
public class Realizetype implements Cloneable {

    public Realizetype() {
        System.out.println("具体原型创建成功！");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype)super.clone();
    }
}

```

**<font style="color:rgb(51, 51, 51);">PrototypeTest（测试访问类）：</font>**

```java
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype r1 = new Realizetype();
        Realizetype r2 = r1.clone();

        System.out.println("对象r1和r2是同一个对象？" + (r1 == r2));
    }
}
```

### 3.3.4 案例
**用原型模式生成“三好学生”奖状**

<font style="color:rgb(51, 51, 51);">同一学校的“三好学生”奖状除了获奖人姓名不同，其他都相同，可以使用原型模式复制多个“三好学生”奖状出来，然后在修改奖状上的名字即可。</font>

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1732514141117-07e158c1-e970-4ac8-ae28-17aabc00bc01.png)

```java
//奖状类
public class Citation implements Cloneable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return (this.name);
    }

    public void show() {
        System.out.println(name + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}

//测试访问类
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation c1 = new Citation();
        c1.setName("张三");

        //复制奖状
        Citation c2 = c1.clone();
        //将奖状的名字修改李四
        c2.setName("李四");

        c1.show();
        c2.show();
    }
}
```

### 3.3.5 使用场景
+ 对象的创建非常复杂，可以使用原型模式快捷的创建对象
+ 性能和安全要求比较高

### 3.3.6 拓展（深克隆）
<font style="color:rgb(51, 51, 51);">将上面的“三好学生”奖状的案例中Citation类的name属性修改为Student类型的属性。代码如下：</font>

```java
//奖状类
public class Citation implements Cloneable {
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    void show() {
        System.out.println(stu.getName() + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}

//学生类
public class Student {
    private String name;
    private String address;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

//测试类
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Citation c1 = new Citation();
        Student stu = new Student("张三", "西安");
        c1.setStu(stu);

        //复制奖状
        Citation c2 = c1.clone();
        //获取c2奖状所属学生对象
        Student stu1 = c2.getStu();
        stu1.setName("李四");

        //判断stu对象和stu1对象是否是同一个对象
        System.out.println("stu和stu1是同一个对象？" + (stu == stu1));

        c1.show();
        c2.show();
    }
}
```

运行结果：

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1732514332530-4447bcd8-3268-4102-bbf8-1cfcce19a2a6.png)

<font style="color:rgb(51, 51, 51);">stu对象和stu1对象是同一个对象，就会产生将stu1对象中name属性值改为“李四”，两个Citation（奖状）对象中显示的都是李四。这就是浅克隆的效果，对具体原型类（Citation）中的引用类型的属性进行引用的复制。这种情况需要使用深克隆，而进行深克隆需要使用对象流。代码如下：</font>

```java
package com.leo.pattern.prototype.test1;

import java.io.*;

//测试类
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

        Citation c1 = new Citation();
        Student stu = new Student("张三", "西安");
        c1.setStu(stu);

        // 创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\citation.txt"));
        oos.writeObject(c1);
        oos.close();

        // 创建对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\citation.txt"));
        Citation c2 = (Citation) ois.readObject();
        c2.getStu().setName("李四");

        // 判断是否是同一个对象
        System.out.println(c1 == c2);

        c1.show();
        c2.show();
    }
}
```

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1732514461737-aeb8fddc-d6a6-4b11-8f87-0e74f217fbf0.png)

## 3.4 建造者模式（生成器模式）
### 3.4.1概述
<font style="color:rgb(51, 51, 51);">将一个复杂对象的构建与表示分离，使得同样的构建过程可以创建不同的表示。</font>

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1732514601674-46c90240-9aa2-488b-b1b5-8417c655e373.png)

+ <font style="color:rgb(51, 51, 51);">分离了部件的构造(由Builder来负责)和装配(由Director负责)。 从而可以构造出复杂的对象。这个模式适用于：某个对象的构建过程复杂的情况。</font>
+ <font style="color:rgb(51, 51, 51);">由于实现了构建和装配的解耦。不同的构建器，相同的装配，也可以做出不同的对象；相同的构建器，不同的装配顺序也可以做出不同的对象。也就是实现了构建算法、装配算法的解耦，实现了更好的复用。</font>
+ <font style="color:rgb(51, 51, 51);">建造者模式可以将部件和其组装过程分开，一步一步创建一个复杂的对象。用户只需要指定复杂对象的类型就可以得到该对象，而无须知道其内部的具体构造细节。</font>

### 3.4.2结构
<font style="color:rgb(51, 51, 51);">建造者（Builder）模式包含如下角色：</font>

+ <font style="color:rgb(51, 51, 51);">抽象建造者类（Builder）：这个接口规定要实现复杂对象的那些部分的创建，并不涉及具体的部件对象的创建。 </font>
+ <font style="color:rgb(51, 51, 51);">具体建造者类（ConcreteBuilder）：实现 Builder 接口，完成复杂产品的各个部件的具体创建方法。在构造过程完成后，提供产品的实例。 </font>
+ <font style="color:rgb(51, 51, 51);">产品类（Product）：要创建的复杂对象。</font>
+ <font style="color:rgb(51, 51, 51);">指挥者类（Director）：调用具体建造者来创建复杂对象的各个部分，在指导者中不涉及具体产品的信息，只负责保证对象各部分完整创建或按某种顺序创建。 </font>

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1732514660604-62df03f2-8574-4b43-bc95-5c6f6a390be8.png)

### 3.4.3 实例
**创建共享单车**

<font style="color:rgb(51, 51, 51);">生产自行车是一个复杂的过程，它包含了车架，车座等组件的生产。而车架又有碳纤维，铝合金等材质的，车座有橡胶，真皮等材质。对于自行车的生产就可以使用建造者模式。</font>

<font style="color:rgb(51, 51, 51);">这里Bike是产品，包含车架，车座等组件；Builder是抽象建造者，MobikeBuilder和OfoBuilder是具体的建造者；Director是指挥者。类图如下：</font>

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1732514713129-e816a2d9-b275-45d5-824c-8970aa6f94b3.png)

```java
//自行车类
public class Bike {
    private String frame;
    private String seat;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}

// 抽象 builder 类
public abstract class Builder {

    protected Bike mBike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();
}

//摩拜单车Builder类
public class MobikeBuilder extends Builder {

    @Override
    public void buildFrame() {
        mBike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}

//ofo单车Builder类
public class OfoBuilder extends Builder {

    @Override
    public void buildFrame() {
        mBike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}

//指挥者类
public class Director {
    private Builder mBuilder;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    public Bike construct() {
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        return mBuilder.createBike();
    }
}

//测试类
public class Client {
    public static void main(String[] args) {
        showBike(new OfoBuilder());
        showBike(new MobikeBuilder());
    }
    private static void showBike(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
```

**注意：**

<font style="color:rgb(51, 51, 51);">上面示例是 Builder模式的常规用法，指挥者类 Director 在建造者模式中具有很重要的作用，它用于指导具体构建者如何构建产品，控制调用先后次序，并向调用者返回完整的产品类，但是有些情况下需要简化系统结构，可以把指挥者类和抽象建造者进行结合</font>

```java
// 抽象 builder 类
public abstract class Builder {

    protected Bike mBike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();
    
    public Bike construct() {
        this.buildFrame();
        this.BuildSeat();
        return this.createBike();
    }
}
```

说明：

<font style="color:rgb(51, 51, 51);">这样做确实简化了系统结构，但同时也加重了抽象建造者类的职责，也不是太符合单一职责原则，如果construct() 过于复杂，建议还是封装到 Director 中。</font>

### <font style="color:rgb(51, 51, 51);">3.4.4 优缺点</font>
**<font style="color:rgb(51, 51, 51);">优点：</font>**

+ <font style="color:rgb(51, 51, 51);">建造者模式的封装性很好。使用建造者模式可以有效的封装变化，在使用建造者模式的场景中，一般产品类和建造者类是比较稳定的，因此，将主要的业务逻辑封装在指挥者类中对整体而言可以取得比较好的稳定性。</font>
+ <font style="color:rgb(51, 51, 51);">在建造者模式中，客户端不必知道产品内部组成的细节，将产品本身与产品的创建过程解耦，使得相同的创建过程可以创建不同的产品对象。</font>
+ <font style="color:rgb(51, 51, 51);">可以更加精细地控制产品的创建过程 。将复杂产品的创建步骤分解在不同的方法中，使得创建过程更加清晰，也更方便使用程序来控制创建过程。</font>
+ <font style="color:rgb(51, 51, 51);">建造者模式很容易进行扩展。如果有新的需求，通过实现一个新的建造者类就可以完成，基本上不用修改之前已经测试通过的代码，因此也就不会对原有功能引入风险。符合开闭原则。</font>

**<font style="color:rgb(51, 51, 51);">缺点：</font>**

<font style="color:rgb(51, 51, 51);">造者模式所创建的产品一般具有较多的共同点，其组成部分相似，如果产品之间的差异性很大，则不适合使用建造者模式，因此其使用范围受到一定的限制。</font>

### <font style="color:rgb(51, 51, 51);">3.4.5 优缺点</font>
建造者(Builder)模式创建的是复杂对象，其产品的各个部分经常面临着剧烈的变化，但将它们组合在一起的算法却相对稳定，通常在以下场合使用。

+ 创建的对象较复杂，由多个部件构成，各部件面临者复杂的变化，但构件间的构造顺序相对稳定。
+ 创建复杂对象的算法独立于该对象的组成部分以及它们的装配方式，即产品的构建过程和最终的表示是独立的。

### <font style="color:rgb(51, 51, 51);">3.4.6 模式拓展</font>
当一个类构造器需要传入很多参数时，如果创建这个类的实例，代码可读性会非常差，而且很容易引入错误，此时就可以利用建造者模式进行重构。

重构前代码：

```java
public class Phone {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    public Phone(String cpu, String screen, String memory, String mainboard) {
        this.cpu = cpu;
        this.screen = screen;
        this.memory = memory;
        this.mainboard = mainboard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }
}

public class Client {
    public static void main(String[] args) {
        //构建Phone对象
        Phone phone = new Phone("intel","三星屏幕","金士顿","华硕");
        System.out.println(phone);
    }
}
```

重构后：

```java
public class Phone {

    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    private Phone(Builder builder) {
        cpu = builder.cpu;
        screen = builder.screen;
        memory = builder.memory;
        mainboard = builder.mainboard;
    }

    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder() {}

        public Builder cpu(String val) {
            cpu = val;
            return this;
        }
        public Builder screen(String val) {
            screen = val;
            return this;
        }
        public Builder memory(String val) {
            memory = val;
            return this;
        }
        public Builder mainboard(String val) {
            mainboard = val;
            return this;
        }
        public Phone build() {
            return new Phone(this);}
    }
    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }
}

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .mainboard("华硕")
                .memory("金士顿")
                .screen("三星")
                .build();
        System.out.println(phone);
    }
}
```

## 3.5 创建者模式对比
### 3.5.1<font style="color:rgb(51, 51, 51);">工厂方法模式VS建造者模式</font>
<font style="color:rgb(51, 51, 51);">工厂方法模式注重的是整体对象的创建方式；而建造者模式注重的是部件构建的过程，意在通过一步一步地精确构造创建出一个复杂的对象。</font>

<font style="color:rgb(51, 51, 51);">我们举个简单例子来说明两者的差异，如要制造一个超人，如果使用工厂方法模式，直接产生出来的就是一个力大无穷、能够飞翔、内裤外穿的超人；而如果使用建造者模式，则需要组装手、头、脚、躯干等部分，然后再把内裤外穿，于是一个超人就诞生了。</font>

### <font style="color:rgb(51, 51, 51);">3.5.2</font><font style="color:rgb(51, 51, 51);">抽象工厂模式VS建造者模式</font>
<font style="color:rgb(51, 51, 51);">抽象工厂模式实现对产品家族的创建，一个产品家族是这样的一系列产品：具有不同分类维度的产品组合，采用抽象工厂模式则是不需要关心构建过程，只关心什么产品由什么工厂生产即可。</font>

<font style="color:rgb(51, 51, 51);">建造者模式则是要求按照指定的蓝图建造产品，它的主要目的是通过组装零配件而产生一个新产品。</font>

<font style="color:rgb(51, 51, 51);">如果将抽象工厂模式看成汽车配件生产工厂，生产一个产品族的产品，那么建造者模式就是一个汽车组装工厂，通过对部件的组装可以返回一辆完整的汽车。</font>

<font style="color:rgb(51, 51, 51);"></font>

# <font style="color:rgb(51, 51, 51);">4.结构型模式</font>
结构型模式描述如何将类或对象按某种布局组成更大的结构，它可以分为类结构型模式和独享结构型模式，前者采用继承机制来组织接口和类，后者采用组合或聚合来组成对象。

组合或聚合关系比继承关系耦合度低，满足“合成复用原则”，所以对象结构型模式比类结构模式具有更大的灵活性。

结构型模式分为以下7种：

+ 代理模式
+ 适配器模式
+ 装饰者模式
+ 桥接模式
+ 外观模式
+ 组合模式
+ 享元模式

## 4.1代理模式
### 4.1.1概述
由于某些原因要给某个对象提供一个代理以控制对该对象的访问，这时，当问对象不适合或者不能之恶引用目标对象，代理对象作为访问对象和目标对象之间的中介。

Java中的代理按照代理类生成时机不同又分为静态代理和动态代理。静态代理代理类在编译器就生成，而动态代理类则是在java运行时动态生成。动态代理又有JDK代理和CGLib代理两种。

### 4.1.2结构
代理（proxy）模式分为三种角色：

+ 抽象主题（Subject）类：通过接口或抽象类声明真实主题和代理对象实现的业务方法。
+ 真实主题（Real Subject）类：实现了抽象主题中的具体业务，是代理对象所代表的真实主题，是最终要引用的对象。
+ 代理（Proxy）类：提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或拓展真实主题的功能。

### 4.1.3静态代理
<font style="color:rgb(51, 51, 51);">如果要买火车票的话，需要去火车站买票，坐车到火车站，排队等一系列的操作，显然比较麻烦。而火车站在多个地方都有代售点，我们去代售点买票就方便很多了。这个例子其实就是典型的代理模式，火车站是目标对象，代售点是代理对象。类图如下：</font>

![](https://cdn.nlark.com/yuque/0/2024/png/38663466/1732771432345-f6abcc18-7834-4168-b205-4158f6e16387.png)

```java
//卖票接口
public interface SellTickets {
    void sell();
}

//火车站  火车站具有卖票功能，所以需要实现SellTickets接口
public class TrainStation implements SellTickets {

    public void sell() {
        System.out.println("火车站卖票");
    }
}

//代售点
public class ProxyPoint implements SellTickets {

    private TrainStation station = new TrainStation();

    public void sell() {
        System.out.println("代理点收取一些服务费用");
        station.sell();
    }
}

//测试类
public class Client {
    public static void main(String[] args) {
        ProxyPoint pp = new ProxyPoint();
        pp.sell();
    }
}
```

<font style="color:rgb(51, 51, 51);">从上面代码中可以看出测试类直接访问的是ProxyPoint类对象，也就是说ProxyPoint作为访问对象和目标对象的中介。同时也对sell方法进行了增强（代理点收取一些服务费用）。</font>

### <font style="color:rgb(51, 51, 51);">4.1.4 JDK动态代理</font>
JDK提供的动态代理，Java中提供一个动态代理类Proxy，Proxy并不是我们上述所说的代理对象的类，而是提供了创建代理对象的静态方法（<font style="color:rgb(51, 51, 51);">newProxyInstance方法</font>）来获取代理对象。

代码：

```java
//卖票接口
public interface SellTickets {
    void sell();
}

//火车站  火车站具有卖票功能，所以需要实现SellTickets接口
public class TrainStation implements SellTickets {

    public void sell() {
        System.out.println("火车站卖票");
    }
}

//代理工厂，用来创建代理对象
public class ProxyFactory {

    private TrainStation station = new TrainStation();

    public SellTickets getProxyObject() {
        //使用Proxy获取代理对象
        /*
            newProxyInstance()方法参数说明：
                ClassLoader loader ： 类加载器，用于加载代理类，使用真实对象的类加载器即可
                Class<?>[] interfaces ： 真实对象所实现的接口，代理模式真实对象和代理对象实现相同的接口
                InvocationHandler h ： 代理对象的调用处理程序
         */
        SellTickets sellTickets = (SellTickets) Proxy.newProxyInstance(station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    /*
                        InvocationHandler中invoke方法参数说明：
                            proxy ： 代理对象
                            method ： 对应于在代理对象上调用的接口方法的 Method 实例
                            args ： 代理对象调用接口方法时传递的实际参数
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println("代理点收取一些服务费用(JDK动态代理方式)");
                        //执行真实对象
                        Object result = method.invoke(station, args);
                        return result;
                    }
                });
        return sellTickets;
    }
}

//测试类
public class Client {
    public static void main(String[] args) {
        //获取代理对象
        ProxyFactory factory = new ProxyFactory();
        
        SellTickets proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }
}
```

ProxyFactory是代理类吗？

ProxyFactory不是代理模式中所说的代理类，而代理类是程序在运行过程中动态的在内存中生成的类，通过阿里巴巴开源的Java诊断工具（<font style="color:rgb(51, 51, 51);">Arthas【阿尔萨斯】</font>）查看代理类的结构

```java
package com.sun.proxy;

import com.itheima.proxy.dynamic.jdk.SellTickets;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

public final class $Proxy0 extends Proxy implements SellTickets {
    private static Method m1;
    private static Method m2;
    private static Method m3;
    private static Method m0;

    public $Proxy0(InvocationHandler invocationHandler) {
        super(invocationHandler);
    }

    static {
        try {
            m1 = Class.forName("java.lang.Object").getMethod("equals", Class.forName("java.lang.Object"));
            m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
            m3 = Class.forName("com.itheima.proxy.dynamic.jdk.SellTickets").getMethod("sell", new Class[0]);
            m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);
            return;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new NoSuchMethodError(noSuchMethodException.getMessage());
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError(classNotFoundException.getMessage());
        }
    }

    public final boolean equals(Object object) {
        try {
            return (Boolean)this.h.invoke(this, m1, new Object[]{object});
        }
        catch (Error | RuntimeException throwable) {
            throw throwable;
        }
        catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    public final String toString() {
        try {
            return (String)this.h.invoke(this, m2, null);
        }
        catch (Error | RuntimeException throwable) {
            throw throwable;
        }
        catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    public final int hashCode() {
        try {
            return (Integer)this.h.invoke(this, m0, null);
        }
        catch (Error | RuntimeException throwable) {
            throw throwable;
        }
        catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    public final void sell() {
        try {
            this.h.invoke(this, m3, null);
            return;
        }
        catch (Error | RuntimeException throwable) {
            throw throwable;
        }
        caSell
```

从上面的类中，我们可以看到一下信息：

+ 代理类（<font style="color:rgb(51, 51, 51);">$Proxy0</font>）实现了SellTickets。真实类和代理类实现同样的接口
+ <font style="color:rgb(51, 51, 51);">代理类（$Proxy0）将我们提供了的匿名内部类对象传递给了父类。</font>

<font style="color:rgb(51, 51, 51);">动态代理的执行流程是什么样？</font>

<font style="color:rgb(51, 51, 51);">下面是摘取的重点代码：</font>

```java
//程序运行过程中动态生成的代理类
public final class $Proxy0 extends Proxy implements SellTickets {
    private static Method m3;

    public $Proxy0(InvocationHandler invocationHandler) {
        super(invocationHandler);
    }

    static {
        m3 = Class.forName("com.itheima.proxy.dynamic.jdk.SellTickets").getMethod("sell", new Class[0]);
    }

    public final void sell() {
        this.h.invoke(this, m3, null);
    }
}

//Java提供的动态代理相关类
public class Proxy implements java.io.Serializable {
	protected InvocationHandler h;
	 
	protected Proxy(InvocationHandler h) {
        this.h = h;
    }
}

//代理工厂类
public class ProxyFactory {

    private TrainStation station = new TrainStation();

    public SellTickets getProxyObject() {
        SellTickets sellTickets = (SellTickets) Proxy.newProxyInstance(station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println("代理点收取一些服务费用(JDK动态代理方式)");
                        Object result = method.invoke(station, args);
                        return result;
                    }
                });
        return sellTickets;
    }
}


//测试访问类
public class Client {
    public static void main(String[] args) {
        //获取代理对象
        ProxyFactory factory = new ProxyFactory();
        SellTickets proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }
}
```

执行流程如下：

1. 在测试类中通过代理对象调用sell()方法
2. 根据多态的特性，执行的是代理类($Proxy0)中的sell()方法
3. 代理类($Proxy0)中的sell()方法中又调用了<font style="color:rgb(51, 51, 51);">InvocationHandler接口的子实现类对象的invoke方法</font>
4. <font style="color:rgb(51, 51, 51);">invoke方法通过反射执行了真实对象所属类（TrainStation）中的sell()方法</font>

### 4.1.5 CGLIB动态代理
> 同样是上面的案例我们使用CGLIB代理实现。
>

<font style="color:rgb(51, 51, 51);">如果没有定义SellTickets接口，只定义了TrainStation(火车站类)。很显然JDK代理是无法使用了，因为JDK动态代理要求必须定义接口，对接口进行代理。</font>

<font style="color:rgb(51, 51, 51);">CGLIB是一个功能强大，高性能的代码生成包。它为没有实现接口的类提供代理，为JDK的动态代理提供了很好的补充。</font>

<font style="color:rgb(51, 51, 51);">CGLIB是第三方提供的包，所以需要引入jar包的坐标：</font>

```xml
<dependency>
  <groupId>cglib</groupId>
  <artifactId>cglib</artifactId>
  <version>2.2.2</version>
</dependency>
```

代码如下：

```java
//火车站
public class TrainStation {

    public void sell() {
        System.out.println("火车站卖票");
    }
}

//代理工厂
public class ProxyFactory implements MethodInterceptor {

    private TrainStation target = new TrainStation();

    public TrainStation getProxyObject() {
        //创建Enhancer对象，类似于JDK动态代理的Proxy类，下一步就是设置几个参数
        Enhancer enhancer =new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation obj = (TrainStation) enhancer.create();
        return obj;
    }

    /*
        intercept方法参数说明：
            o ： 代理对象
            method ： 真实对象中的方法的Method实例
            args ： 实际参数
            methodProxy ：代理对象中的方法的method实例
     */
    public TrainStation intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理点收取一些服务费用(CGLIB动态代理方式)");
        TrainStation result = (TrainStation) methodProxy.invokeSuper(o, args);
        return result;
    }
}

//测试类
public class Client {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = factory.getProxyObject();

        proxyObject.sell();
    }
}
```

