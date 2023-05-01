class Solution {
    public int[] solution(int n) {
        int[] answer ;

        if (n % 2 == 0) {
            answer = new int[n/2];
        } else {
            answer = new int[n/2+1];
        }

        for (int i=1; i<=n; i++) {
            if (i % 2 == 1) {
                answer[i/2] = i;
            }
        }

        return answer;
    }
}

// 다른 사람 풀이 1   --> 자바랑 친해진 후에 다시..ㅜㅜ
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}

// 다른 사람 풀이 2
import java.util.List;
        import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i % 2 == 1){
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }
}

// * ArrayList
//   - List 인터페이스를 상속받은 클래스로 크기가 가변적으로 변하는 선형리스트
//   - 일반적인 배열과 같은 순차리스트이며, 인덱스로 내부의 객체를 관리한다는 점 등이 유사하지만 한 번 생성되면 크기가 변하지 않는 배열과 달리
//     Array List는 객체들이 추가되어 저장 용량(capacity)을 초과한다면 자동으로 부족한 크기만큼 저장 용량이 늘어나는 특징을 가짐
//
// * ArrayList 선언
//   - ArrayList list = new ArrayList();     // 타입 미설정 Object로 선언됨
//   - ArrayList<Integer> num = new ArrayList<Integer>();       // 타입 설정 int 타입만 사용 가능
//   - ArrayList<Integer> num2 = new ArrayList<>();             //new에서 타입 파라미터 생략가능
//   - ArrayList<Integer> num3 = new ArrayList<Integer>(10);    //초기 용량(capacity)지정
//   - ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3));   //생성시 값추가
//
// * ArrayList 값 추가
//   - ArrayList<Integer> list = new ArrayList<Integer>();
//   - list.add(3);       //값 추가
//   - list.add(null);    //null값도 add가능
//   - list.add(1,10);    //index 1에 10 삽입

// * mapToInt
//   - Stream을 IntStream으로 변환해주는 메서드

// * toArray
//   - List를 Array로 변환