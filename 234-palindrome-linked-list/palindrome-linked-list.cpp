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
    bool isPalindrome(ListNode* head) {
        ListNode* slow=head;
        ListNode* fast=head;
        ListNode* prev=NULL;
        ListNode* temp=head;
        while(fast!=NULL && fast->next!=NULL){
            fast=fast->next->next;
            prev=slow;
            slow=slow->next;
        }
        ListNode* curr=slow;
        ListNode* left=NULL;
        while(curr!=NULL){
            ListNode* right=curr->next;
            curr->next=left;
            left=curr;
            curr=right;
        }
         int flag=0;
        while(temp!=NULL && left!=NULL){
            if(temp->val !=left->val){
                flag=1;
                break;
            }
            temp=temp->next;
            left=left->next;
        }
        if(flag==0){
            return true;
        }
        else{
            return false;
        }
    }
};