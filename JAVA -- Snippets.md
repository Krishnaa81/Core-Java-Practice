&#x09;

### &#x20;              **SNIPPETS**

&#x20;                             **----------------**



#### **INCREMENTS/DECREMENTS:-**

**-----------------------------------------**



##### Question 1

##### \----------

public class Demo1 {

&#x20;   public static void main(String\[] args) {



&#x20;       int a = 5;

&#x20;       int b = ++a + a++;    			 **// b->12	  //a->7**



&#x20;       System.out.println("a = " + a); 	// **o/p -> 7**

&#x20;       System.out.println("b = " + b);  	// **o/p -> 12**



&#x20;   }

}





##### Question 2

##### \----------

public class Demo2 {

&#x20;   public static void main(String\[] args) {



&#x20;       int x = 10;



&#x20;       System.out.println(x++);  	**o/p -> 10   //x=11**

&#x20;       System.out.println(++x);  	**o/p -> 12   //x=12**

&#x20;       System.out.println(--x);  	**o/p -> 11   //x=11**

&#x20;       System.out.println(x--);  	**o/p -> 11   //x=10**

&#x20;       System.out.println(x);    	**o/p -> 10**



&#x20;   }

}





##### Question 3

##### \----------

public class Demo3 {

&#x20;   public static void main(String\[] args) {



&#x20;       int a = 3;

&#x20;       int b = 4;



&#x20;       int c = a++ + ++b + --a + b--;   	**//c->16  //a->3  //b->4**



&#x20;       System.out.println("a = " + a);  	**o/p a->3**

&#x20;       System.out.println("b = " + b);  	**o/p b->4**

&#x20;       System.out.println("c = " + c);  	**o/p c->16**



&#x20;   }

}





##### Question 4

##### \-----------

public class Demo4 {

&#x20;   public static void main(String\[] args) {



&#x20;       int i = 2;



&#x20;       i = i++ + ++i;    		**// o/p=i->6  //i->4**



&#x20;       System.out.println(i);  	**//o/p -> 6**



&#x20;   }

}





##### Question 5

##### \-----------

public class Demo5 {

&#x20;   public static void main(String\[] args) {



&#x20;       int x = 7;

&#x20;       int y = 5;



&#x20;       int z = --x + y++ + ++x + --y;    	**//z->23   //x->7   //y->5**



&#x20;       System.out.println("x = " + x); 	**o/p x->7**

&#x20;       System.out.println("y = " + y); 	**o/p y->5**

&#x20;       System.out.println("z = " + z); 	**o/p z->23**



&#x20;   }

}





##### **Question 6**

##### \----------

public class Demo6 {

&#x20;   public static void main(String\[] args) {



&#x20;       int a = 1;



&#x20;       System.out.println(a++);  **o/p a->1 	//a->2**

&#x20;       System.out.println(a++);  **o/p a->2  	//a->3**

&#x20;       System.out.println(++a);  **o/p a->4  	//a->4**

&#x20;       System.out.println(--a);  **o/p a->3  	//a->3**

&#x20;       System.out.println(a--);  **o/p a->3  	//a->2**

&#x20;       System.out.println(a);    **o/p a->2**



&#x20;   }

}



#### 

#### **Jumping Statements (4 Questions)**

**--------------------------------------------------------**



##### Question 7 (break)

\----------------------------

public class Demo7 {

&#x20;   public static void main(String\[] args) {



&#x20;       for (int i = 1; i <= 10; i++) {



&#x20;           if (i == 6)

&#x20;               break;



&#x20;           System.out.print(i + " ");     **//o/p i-> 1 2 3 4 5**

&#x20;       }



&#x20;   }

}





##### Question 8 (continue)

\---------------------------------

public class Demo8 {

&#x20;   public static void main(String\[] args) {



&#x20;       for (int i = 1; i <= 8; i++) {



&#x20;           if (i % 2 == 0)

&#x20;               continue;



&#x20;           System.out.print(i + " ");     **//o/p i-> 1 3 5 7**

&#x20;       }



&#x20;   }

}





##### Question 9 (break + continue)

##### \-----------------------------

public class Demo9 {

&#x20;   public static void main(String\[] args) {



&#x20;       for (int i = 1; i <= 10; i++) {



&#x20;           if (i == 3)

&#x20;               continue;



&#x20;           if (i == 8)

&#x20;               break;



&#x20;           System.out.print(i + " ");     **//o/p i-> 1 2 4 5 6 7**

&#x20;       }



&#x20;   }

}





##### Question 10 (Nested Loop with break)

\---------------------------------------------------------



public class Demo10 {

&#x20;   public static void main(String\[] args) {



&#x20;       for (int i = 1; i <= 3; i++) {



&#x20;           for (int j = 1; j <= 3; j++) {



&#x20;               if (j == 2)

&#x20;                   break;



&#x20;               System.out.print(i + "" + j + " ");        **//o/p  i "+" j  ->  1 1  2 1  3 1**

&#x20;           }



&#x20;       }



&#x20;   }

}

