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
    ListNode* reverseKGroup(ListNode* head, int k) {
        ListNode* temp=head;
        int cnt=0;
        while (temp){
            cnt++;
            temp=temp->next;
        }
        if(k>cnt){
            return head;
        }
        ListNode* res=head;
        ListNode* prev=NULL;
        ListNode* next=NULL;
        for(int i=0;i<k;i++){
            next=res->next;
            res->next=prev;
            prev=res;
            res=next;
        }
        head->next=reverseKGroup(res,k);
        return prev;
    }
};