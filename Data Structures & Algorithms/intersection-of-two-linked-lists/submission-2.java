public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        // if(headA==null || headB==null)return null;

        HashSet<ListNode> set=new HashSet<>();

        while(headA!=null){
            set.add(headA);
            headA=headA.next;
        }

        while(headB!=null){
            if(set.contains(headB)){
                return headB;
            }
           headB=headB.next;
            
        }

 return null;
    }
    }
//       class Solution {

//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

//         // Step 1: Get lengths
//         int lenA = getLength(headA);
//         int lenB = getLength(headB);

//         // Step 2: Align both lists
//         while (lenA > lenB) {
//             headA = headA.next;
//             lenA--;
//         }

//         while (lenB > lenA) {
//             headB = headB.next;
//             lenB--;
//         }

//         // Step 3: Move both together
//         while (headA != headB) {
//             headA = headA.next;
//             headB = headB.next;
//         }

//         // Step 4: Return intersection node (or null)
//         return headA;
//     }

//     // Helper function to calculate length
//     private int getLength(ListNode head) {
//         int count = 0;
//         while (head != null) {
//             count++;
//             head = head.next;
//         }
//         return count;
//     }
// }
//     // }
// // }