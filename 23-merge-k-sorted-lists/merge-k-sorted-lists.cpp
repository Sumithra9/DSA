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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2){
        if(!list1) return list2;
        if(!list2) return list1;

        if(list1->val>list2->val){
            swap(list1,list2);
        }

        ListNode* temp1=list1;
        ListNode* temp2=list2;
        while(temp1!=NULL && temp2!=NULL){
            if(temp1->next==NULL||temp1->next->val>=temp2->val){
                ListNode* tempnew=temp2->next;
                temp2->next=temp1->next;
                temp1->next=temp2; 
                temp2=tempnew;
            }
            if(temp1->next!=NULL){
                temp1=temp1->next;
            }
        }
        return list1;
    }
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        if(lists.empty()) return NULL;
        return mergeKHelper(lists,0,lists.size()-1);
    }
    ListNode* mergeKHelper(vector<ListNode*>& lists,int left,int right){
        if(left==right) return lists[left];
        if(left>right) return NULL;
        int mid=left+(right-left)/2;
        ListNode* list1=mergeKHelper(lists,left,mid);
        ListNode* list2=mergeKHelper(lists,mid+1,right);
        return mergeTwoLists(list1,list2);

    }
};