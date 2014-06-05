public class GenericClass<T extends GenericClass> {
    // Some generic logic that want to apply on different type
    // This method is also return different type 
    abstract public T doSomething();
}
