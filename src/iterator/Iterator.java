package iterator;

public interface Iterator {
    // 반복작업을 더 적용할 대상이 있는지 확인할 수 있음
    boolean hasNext();

    // 다음 객체 리턴
    MenuItem next();
}

//