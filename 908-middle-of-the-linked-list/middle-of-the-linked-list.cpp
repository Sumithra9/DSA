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
    ListNode* middleNode(ListNode* head) {
        int x=0;
        ListNode* current=head;
        while(current!=NULL){
            current=current->next;
            x++;
        }
        ListNode* middle=head;
        for(int i=0;i<x/2;i++){
            middle=middle->next;
        }
        return middle;
    }
};