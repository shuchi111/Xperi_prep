
public class tc1 {

    List<int> mergeSort(List<int> array) {
        if (array.length <= 1) {
            return array;
        }
        final mid  = array.length ~/ 2;
        final left  = array.sublist(0, mid);
        final right  = array.sublist(mid);
        final sortedLeft  = mergeSort(left);
        final sortedRight  = mergeSort(right);
        return merge(sortedLeft, sortedRight);
    }

}
