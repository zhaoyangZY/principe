七大软件设计原则
###### 一.开闭原则
概念：开闭原则（Open-Closed Principle, OCP）是指一个软件实体如类、模块和函数应该对扩展开放， 对修改关闭。
优点：可复用性及可维护性
###### 二.依赖倒置原则
概念：依赖倒置原则（Dependence Inversion Principle,DIP）是指设计代码结构时，高层模块不应该依 赖底层模块，二者都应该依赖其抽象。
优点：减少耦合性，提高可维护性
###### 三.单一职责原则
概念：单一职责（Simple Responsibility Pinciple，SRP）是指不要存在多于一个导致类变更的原因。
优点：降低复杂性，提高可维护性
###### 四.接口隔离原则
概念：接口隔离原则（Interface Segregation Principle, ISP）是指用多个专门的接口，而不使用单一的 总接口，客户端不应该依赖它不需要的接口。
优点：高内聚，低耦合
###### 五.迪米特法则
概念：迪米特原则（Law of Demeter LoD）是指一个对象应该对其他对象保持最少的了解，又叫最少知 道原则（Least Knowledge Principle,LKP），尽量降低类与类之间的耦合。
优点：降低类之间的耦合
###### 六.里式替换原则
概念：里氏替换原则（Liskov Substitution Principle,LSP）是指如果对每一个类型为 T1 的对象 o1,都有 类型为 T2 的对象 o2,使得以 T1 定义的所有程序 P 在所有的对象 o1 都替换成 o2 时，程序 P 的行为没 有发生变化，那么类型 T2 是类型 T1 的子类型。
优点：子类对象能够替换父类对象
###### 七.合成复用原则
概念：合成复用原则（Composite/Aggregate Reuse Principle,CARP）是指尽量使用对象组合(has-a)/ 聚合(contanis-a)，而不是继承关系达到软件复用的目的。
优点：降低类之间的耦合
