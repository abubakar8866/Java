package generics;

public class ImplementingGenerics {

	public static void main(String[] args) {

		/*
		 * Simple<Integer,String> simple = new Simple<>(1,"abu");
		 * System.out.println(simple.getId()); System.out.println(simple.getName());
		 */

		/*
		 * Create a generic class Printer<T extends Number> and explain why extends is
		 * required.
		 * 
		 * Why does this code not compile?
		 * 
		 * class Test<T> { void print() { System.out.println(T.intValue()); } }
		 * 
		 * 
		 * How can you fix it using bounded generics?
		 * 
		 * Write a generic method that accepts only types implementing Comparable<T>.
		 * 
		 * What will happen if we write:
		 * 
		 * class Demo<T extends Number & Comparable<T>> { }
		 * 
		 * 
		 * Why is Number written first?
		 * 
		 * Can we use super in type parameter declaration like this?
		 * 
		 * class Demo<T super Number> { }
		 * 
		 * 
		 * Why or why not?
		 */

		/*
		 * 1️⃣ Create a generic class Printer<T extends Number> class Printer<T extends
		 * Number> {
		 * 
		 * private T value;
		 * 
		 * Printer(T value) { this.value = value; }
		 * 
		 * void printDoubleValue() { System.out.println(value.doubleValue()); } }
		 * 
		 * ✅ Why is extends required?
		 * 
		 * If you write:
		 * 
		 * class Printer<T> { T value;
		 * 
		 * void printDoubleValue() { System.out.println(value.doubleValue()); // ❌
		 * Compile error } }
		 * 
		 * 
		 * ❌ Compiler error: doubleValue() is undefined for type T.
		 * 
		 * Because:
		 * 
		 * The compiler doesn't know what T is.
		 * 
		 * T could be String, Object, anything.
		 * 
		 * ✔ When we write: class Printer<T extends Number>
		 * 
		 * 
		 * Now:
		 * 
		 * T can only be subclasses of Number
		 * 
		 * Like: Integer, Double, Float, etc.
		 * 
		 * All subclasses of Number have methods like:
		 * 
		 * intValue()
		 * 
		 * doubleValue()
		 * 
		 * longValue()
		 * 
		 * So now compiler allows:
		 * 
		 * value.doubleValue();
		 * 
		 * 2️⃣ Why does this code not compile? class Test<T> { void print() {
		 * System.out.println(T.intValue()); } }
		 * 
		 * ❌ Problems:
		 * 
		 * T is a type, not an object.
		 * 
		 * You're trying to call instance method on type name.
		 * 
		 * T is unbounded — compiler doesn't know if it has intValue().
		 * 
		 * 3️⃣ Fix using bounded generics
		 * 
		 * Correct version:
		 * 
		 * class Test<T extends Number> {
		 * 
		 * private T value;
		 * 
		 * Test(T value) { this.value = value; }
		 * 
		 * void print() { System.out.println(value.intValue()); } }
		 * 
		 * 
		 * Now it works because:
		 * 
		 * T is guaranteed to be a Number
		 * 
		 * Number has intValue()
		 * 
		 * 4️⃣ Generic method that accepts only types implementing Comparable<T> public
		 * static <T extends Comparable<T>> void compare(T a, T b) {
		 * 
		 * if (a.compareTo(b) > 0) { System.out.println("First is greater"); } else if
		 * (a.compareTo(b) < 0) { System.out.println("Second is greater"); } else {
		 * System.out.println("Both are equal"); } }
		 * 
		 * ✅ Why this works?
		 * 
		 * T extends Comparable<T> ensures:
		 * 
		 * Whatever type is passed
		 * 
		 * It must implement Comparable<T>
		 * 
		 * So compareTo() method is guaranteed
		 * 
		 * Example:
		 * 
		 * compare(10, 20); // Integer implements Comparable compare("A", "B"); //
		 * String implements Comparable
		 * 
		 * 5️⃣ What happens here? class Demo<T extends Number & Comparable<T>> { }
		 * 
		 * ✅ This is valid.
		 * 
		 * It means:
		 * 
		 * T must:
		 * 
		 * Extend Number
		 * 
		 * Implement Comparable<T>
		 * 
		 * Example valid types:
		 * 
		 * Integer
		 * 
		 * Double
		 * 
		 * Because:
		 * 
		 * Integer extends Number implements Comparable<Integer>
		 * 
		 * 6️⃣ Why is Number written first?
		 * 
		 * Java rule:
		 * 
		 * In multiple bounds, class must come first, then interfaces.
		 * 
		 * Correct:
		 * 
		 * <T extends Number & Comparable<T>>
		 * 
		 * 
		 * Wrong:
		 * 
		 * <T extends Comparable<T> & Number> // ❌ Compile error
		 * 
		 * 
		 * Why?
		 * 
		 * Because:
		 * 
		 * Java allows only one class in inheritance
		 * 
		 * That class must be written first
		 * 
		 * After that, multiple interfaces can be added using &
		 * 
		 * 7️⃣ Can we use super like this? class Demo<T super Number> { }
		 * 
		 * ❌ No, this is NOT allowed. Why?
		 * 
		 * super is allowed only in wildcard types:
		 * 
		 * List<? super Number> list;
		 * 
		 * 
		 * But NOT in type parameter declaration.
		 * 
		 * Why is super not allowed in type parameter?
		 * 
		 * Because:
		 * 
		 * extends defines upper bound
		 * 
		 * Type parameter must have a specific upper bound
		 * 
		 * Lower bound (super) doesn't make sense for type declaration
		 * 
		 * Java only allows:
		 * 
		 * <T> <T extends Something> <T extends Class & Interface1 & Interface2>
		 * 
		 * 
		 * But NOT:
		 * 
		 * <T super Something> ❌
		 * 
		 * 🔥 Important Concept Summary Concept Meaning T extends Number Upper bound ?
		 * extends Number Read-only (covariant) ? super Number Write-only
		 * (contravariant) Class must come first in multiple bounds Java rule super not
		 * allowed in type parameter Only allowed in wildcards
		 * 
		 */

		/*
		 * Upper & Lower Bounded Wildcards (? extends, ? super) — 5 Questions
		 * 
		 * Why can we read but not add elements in:
		 * 
		 * List<? extends Number> list;
		 * 
		 * 
		 * Why can we add but only read as Object in:
		 * 
		 * List<? super Integer> list;
		 * 
		 * 
		 * Explain PECS rule with an example method.
		 * 
		 * What is the difference between:
		 * 
		 * List<Number> List<? extends Number> List<? super Number>
		 * 
		 * 
		 * Write one method that:
		 * 
		 * Accepts List<? extends Number> and prints elements.
		 * 
		 * Accepts List<? super Integer> and adds integers.
		 */

		/*
		 * 1️⃣ Why can we read but NOT add in: List<? extends Number> list;
		 * 
		 * Meaning
		 * 
		 * ? extends Number means:
		 * 
		 * The list contains some unknown subtype of Number
		 * 
		 * It could be:
		 * 
		 * List<Integer> List<Double> List<Float>
		 * 
		 * 
		 * But compiler doesn’t know which one.
		 * 
		 * ✅ Why can we READ?
		 * 
		 * Because:
		 * 
		 * All elements are guaranteed to be at least Number.
		 * 
		 * Number n = list.get(0); // ✅ Safe
		 * 
		 * ❌ Why can't we ADD?
		 * 
		 * Suppose:
		 * 
		 * List<? extends Number> list = new ArrayList<Integer>();
		 * 
		 * 
		 * If Java allowed:
		 * 
		 * list.add(3.14); // Double
		 * 
		 * 
		 * Then we'd be inserting a Double into List<Integer> ❌
		 * 
		 * That would break type safety.
		 * 
		 * So compiler blocks adding anything (except null).
		 * 
		 * 2️⃣ Why can we ADD but only read as Object in: List<? super Integer> list;
		 * 
		 * Meaning
		 * 
		 * ? super Integer means:
		 * 
		 * The list contains Integer OR any superclass of Integer
		 * 
		 * Possible types:
		 * 
		 * List<Integer> List<Number> List<Object>
		 * 
		 * ✅ Why can we ADD Integer?
		 * 
		 * Because:
		 * 
		 * All these types can safely hold an Integer:
		 * 
		 * Integer → yes
		 * 
		 * Number → yes
		 * 
		 * Object → yes
		 * 
		 * So:
		 * 
		 * list.add(10); // ✅
		 * 
		 * ❌ Why can we only read as Object?
		 * 
		 * Suppose:
		 * 
		 * List<? super Integer> list = new ArrayList<Object>();
		 * 
		 * 
		 * When reading:
		 * 
		 * Integer i = list.get(0); // ❌ Not safe
		 * 
		 * 
		 * Because list might be List<Object>.
		 * 
		 * Compiler only guarantees:
		 * 
		 * Object obj = list.get(0); // ✅ Safe
		 * 
		 * 
		 * So reading type = Object.
		 * 
		 * 3️⃣ Explain PECS Rule PECS =
		 * 
		 * Producer Extends, Consumer Super
		 * 
		 * 📌 If a structure PRODUCES data → use extends 📌 If a structure CONSUMES data
		 * → use super Example: // PRODUCER → we only read public static void
		 * printNumbers(List<? extends Number> list) { for (Number n : list) {
		 * System.out.println(n); } }
		 * 
		 * 
		 * Here:
		 * 
		 * List produces Numbers
		 * 
		 * So use extends
		 * 
		 * // CONSUMER → we only add public static void addIntegers(List<? super
		 * Integer> list) { list.add(10); list.add(20); }
		 * 
		 * 
		 * Here:
		 * 
		 * List consumes Integers
		 * 
		 * So use super
		 * 
		 * 4️⃣ Difference Between 🔹 List<Number>
		 * 
		 * Exact type only.
		 * 
		 * List<Number> list = new ArrayList<Number>();
		 * 
		 * 
		 * ❌ Cannot assign:
		 * 
		 * List<Integer> list = new ArrayList<>(); // ❌
		 * 
		 * 
		 * You can:
		 * 
		 * Add Integer
		 * 
		 * Add Double
		 * 
		 * Read as Number
		 * 
		 * 🔹 List<? extends Number>
		 * 
		 * Flexible upper bound.
		 * 
		 * Accepts:
		 * 
		 * List<Integer> List<Double> List<Float>
		 * 
		 * 
		 * You can:
		 * 
		 * Read as Number
		 * 
		 * ❌ Cannot add
		 * 
		 * 🔹 List<? super Number>
		 * 
		 * Lower bound.
		 * 
		 * Accepts:
		 * 
		 * List<Number> List<Object>
		 * 
		 * 
		 * You can:
		 * 
		 * Add Number
		 * 
		 * Add Integer
		 * 
		 * Read only as Object
		 * 
		 * 🔥 Summary Table Type Can Add Can Read Accepts List<Number> Number &
		 * subclasses Number Only Number List<? extends Number> ❌ Number Integer,
		 * Double, etc List<? super Number> Number Object Number, Object 5️⃣ Required
		 * Methods ✅ Method 1 — Print Elements public static void printList(List<?
		 * extends Number> list) { for (Number n : list) { System.out.println(n); } }
		 * 
		 * 
		 * Usage:
		 * 
		 * printList(List.of(1, 2, 3)); // Integer list printList(List.of(1.2, 3.4)); //
		 * Double list
		 * 
		 * ✅ Method 2 — Add Integers public static void addIntegers(List<? super
		 * Integer> list) { list.add(100); list.add(200); }
		 * 
		 * 
		 * Usage:
		 * 
		 * List<Number> numbers = new ArrayList<>(); addIntegers(numbers);
		 * 
		 * List<Object> objects = new ArrayList<>(); addIntegers(objects);
		 * 
		 * 🎯 Final Interview-Level Understanding
		 * 
		 * Think like this:
		 * 
		 * extends → Flexible for reading
		 * 
		 * super → Flexible for writing
		 * 
		 * Exact type → Both read and write but no flexibility
		 */

		/*
		 * Unbounded Wildcard (?) — 5 Questions
		 * 
		 * What is the difference between:
		 * 
		 * List<?> List<Object>
		 * 
		 * 
		 * Why can we only add null to List<?>?
		 * 
		 * When should we use <?> instead of <T>?
		 * 
		 * What will be the return type of:
		 * 
		 * List<?> list; list.get(0);
		 * 
		 * 
		 * Why is this allowed?
		 * 
		 * List<String> strList = new ArrayList<>(); List<?> list = strList;
		 * 
		 * 
		 * But this is not?
		 * 
		 * List<Object> objList = strList;
		 */

		/*
		 * 1️⃣ Difference Between 🔹 List<?> 🔹 List<Object> ✅ List<Object>
		 * 
		 * Means:
		 * 
		 * A list that can store only Object type
		 * 
		 * Example:
		 * 
		 * List<Object> list = new ArrayList<>(); list.add("Hello"); list.add(10);
		 * list.add(3.14);
		 * 
		 * 
		 * ✔ You can add anything (because everything extends Object)
		 * 
		 * ❌ But you CANNOT assign:
		 * 
		 * List<String> strList = new ArrayList<>(); List<Object> objList = strList; //
		 * ❌ Compile error
		 * 
		 * 
		 * Why?
		 * 
		 * Because generics are invariant in Java.
		 * 
		 * List<String> is NOT a subtype of List<Object>.
		 * 
		 * ✅ List<?>
		 * 
		 * Means:
		 * 
		 * A list of some unknown type
		 * 
		 * It could be:
		 * 
		 * List<String> List<Integer> List<Double> List<Object>
		 * 
		 * 
		 * But compiler doesn't know which.
		 * 
		 * So:
		 * 
		 * ✔ You can assign:
		 * 
		 * List<String> strList = new ArrayList<>(); List<?> list = strList; // ✅
		 * Allowed
		 * 
		 * 
		 * ❌ You cannot add elements (except null)
		 * 
		 * ✔ You can read elements as Object
		 * 
		 * 🔥 Key Concept
		 * 
		 * List<?> = read-only, type-safe view of any list.
		 * 
		 * 2️⃣ Why can we only add null to List<?>?
		 * 
		 * Example:
		 * 
		 * List<?> list = new ArrayList<String>();
		 * 
		 * 
		 * Compiler doesn't know whether it is:
		 * 
		 * List<String>
		 * 
		 * List<Integer>
		 * 
		 * List<Double>
		 * 
		 * If Java allowed:
		 * 
		 * list.add("Hello");
		 * 
		 * 
		 * What if the actual list is List<Integer>?
		 * 
		 * That would break type safety.
		 * 
		 * So Java blocks adding anything except:
		 * 
		 * list.add(null); // ✅ allowed
		 * 
		 * 
		 * Because null is valid for all reference types.
		 * 
		 * 3️⃣ When should we use <?> instead of <T>?
		 * 
		 * Use <?> when:
		 * 
		 * ✔ You don't care about the type ✔ You only need to read as Object ✔ You want
		 * maximum flexibility ✔ You are not adding elements
		 * 
		 * Example: Printing any list public static void printList(List<?> list) { for
		 * (Object obj : list) { System.out.println(obj); } }
		 * 
		 * 
		 * If you used:
		 * 
		 * public static <T> void printList(List<T> list)
		 * 
		 * 
		 * That works too — but:
		 * 
		 * <T> is useful when you need to use T somewhere else.
		 * 
		 * <?> is simpler when type is irrelevant.
		 * 
		 * 🔥 Rule
		 * 
		 * Use:
		 * 
		 * <?> → when type is unknown and irrelevant
		 * 
		 * <T> → when you need to preserve the type relationship
		 * 
		 * 4️⃣ What is return type of: List<?> list; list.get(0);
		 * 
		 * ✅ Return type = Object
		 * 
		 * Because:
		 * 
		 * Compiler only knows:
		 * 
		 * It is some unknown type.
		 * 
		 * So safest supertype = Object.
		 * 
		 * Equivalent to:
		 * 
		 * Object obj = list.get(0);
		 * 
		 * 5️⃣ Why is this allowed? List<String> strList = new ArrayList<>(); List<?>
		 * list = strList; // ✅ Allowed
		 * 
		 * 
		 * Because:
		 * 
		 * <?> means:
		 * 
		 * Some unknown type
		 * 
		 * So:
		 * 
		 * List<String> fits
		 * 
		 * List<Integer> fits
		 * 
		 * List<Double> fits
		 * 
		 * It is a covariant reference.
		 * 
		 * 6️⃣ Why is this NOT allowed? List<Object> objList = strList; // ❌
		 * 
		 * 
		 * Because Java generics are invariant.
		 * 
		 * If it was allowed:
		 * 
		 * List<String> strList = new ArrayList<>(); List<Object> objList = strList;
		 * 
		 * objList.add(10); // Now Integer goes into String list ❌
		 * 
		 * 
		 * That would break type safety.
		 * 
		 * So compiler prevents it.
		 * 
		 * 🎯 Final Concept Summary Type Can Add Can Read As Accepts List<Object>
		 * Anything Object Only Object List<?> Only null Object Any List List<String>
		 * String only String Only String 🔥 Deep Interview Insight
		 * 
		 * Think hierarchy:
		 * 
		 * Object ↑ Number ↑ Integer
		 * 
		 * 
		 * But:
		 * 
		 * List<Object> List<Number> List<Integer>
		 * 
		 * 
		 * These are NOT related.
		 * 
		 * Generics are invariant.
		 */

	}

}
