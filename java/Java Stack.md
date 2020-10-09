## 知识学习

### Java数据结构

Java工具包提供了强大的数据结构。在Java中的数据结构主要包括以下几种接口和类：
* 枚举（Enumeration）

* 位集合（BitSet）

* 向量（Vector）

* **栈（Stack）**

* 字典（Dictionary）

* 哈希表（Hashtable）

* 属性（Properties）    

  

#### Stack

##### Creating a Stack

* If we want to create a stack, first, import the `java.util` package and create an object of the Stack class.

1. `Stack stk = new Stack()`; 

   Or

2. ```Stack<type> stk = new Stack<>()```; 

   Where type denotes the type of stack like Integer, String, etc.



### 逆波兰式

> 逆波兰记法中，操作符置于操作数的后面。例如表达“三加四”时，写作“3 4 + ”，而不是“3 + 4”。如果有多个操作符，操作符置于第二个操作数的后面，所以常规中缀记法的“3 - 4 + 5”在逆波兰记法中写作“3 4 - 5 + ”：先3减去4，再加上5。使用逆波兰记法的一个好处是不需要使用括号。例如中缀记法中“3 - 4 * 5”与“（3 - 4）*5”不相同，但后缀记法中前者写做“3 4 5 * - ”，无歧义地表示“3 (4 5 *) -”；后者写做“3 4 - 5 * ”。

> 解释过程一般是：操作数入栈；遇到操作符时，操作数出栈，求值，将结果入栈；当一遍后，栈顶就是表达式的值。因此逆波兰表达式的求值使用**堆栈结构**很容易实现，并且能很快求值。









