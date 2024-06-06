/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        
        ListNode* temp1 = new ListNode();
        ListNode* temp2 = temp1; //to keep track of head

        int carry = 0;

        while (l1 != NULL || l2 != NULL || carry != 0){
            int suma = 0;
            if (l1 != NULL){
                suma += l1->val;
                l1 = l1->next;
            }
            if (l2 != NULL){
                suma += l2->val;
                l2 = l2->next;
            }
            suma += carry;
            carry = suma /10;

            ListNode* createnode = new ListNode(suma%10); 
            temp1->next = createnode;
            temp1 = temp1->next;
        }
        return temp2->next; // since temp2 has null value
        }
    };
