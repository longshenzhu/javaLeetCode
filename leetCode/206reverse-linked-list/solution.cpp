class Solution {
public:
    // 非递归的方法
    // ListNode* reverseList(ListNode* head) {
    //     if(head == nullptr)return head;
    //     ListNode *pre = nullptr, *cur = head, *next = head->next;
    //     while(next != nullptr){
    //         cur->next = pre;
    //         pre = cur;
    //         cur = next;
    //         next = next->next;
    //     }
    //     cur->next = pre;
    //     return cur;
    // }
    // 递归的方法
    // ListNode* reverseList(ListNode* head) {
    //     if(head == nullptr || head->next == nullptr)return head;
    //     ListNode *tail = head->next;
    //     ListNode *p = reverseList(head->next);
    //     tail->next = head;
    //     head->next = nullptr;
    //     return p;
    // }

    // 递归的方式反转前n个节点
    ListNode* reverseList(ListNode* head, int n) {
        if(n == 1)return head;
        ListNode *tail = head->next;
        ListNode *p = reverseList(head->next, n-1);
        head->next = tail->next;  //接上未反转的部分
        tail->next = head;
        return p;
    }


};