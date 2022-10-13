//wrp to demo StringBuilders and StringBuffer
//Manovadhan M CG BATCH 2576
import java.util.*;
class MyString
{
	StringBuffer s = new StringBuffer("first program");
	StringBuilder t = new StringBuilter("hello");
	s.append("first program");
	s.insert(5,"My");
	s.reverse();
	s.delete(0,5);
	System.out.println(s);
	t.append("java");
	t.insert(1,"java");
	t.delete(1,3);
	t.reverse();
	System.out.println(t);
	
}