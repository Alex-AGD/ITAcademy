package workHome.streamapi_lamda;

public interface OperatorWithJeneric<T> { //использ дженерик если мы не знаем какой тип данным нам может потреоваться.
    T getResult(T value1, T value2);
}
