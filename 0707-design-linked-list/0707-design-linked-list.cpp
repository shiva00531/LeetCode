class MyLinkedList {
public:
    struct Node {
        int val;
        Node* next;
        Node* prev;
        Node(int v): val(v), next(nullptr), prev(nullptr) {}
    };

    Node* head;
    Node* tail;
    int size;

    MyLinkedList() {
        head = new Node(0);
        tail = new Node(0);
        head->next = tail;
        tail->prev = head;
        size = 0;
    }
    
    int get(int index) {
        if (index < 0 || index >= size) return -1;
        Node* cur;
        if (index < size/2) {
            cur = head->next;
            for (int i = 0; i < index; ++i) cur = cur->next;
        } else {
            cur = tail->prev;
            for (int i = size - 1; i > index; --i) cur = cur->prev;
        }
        return cur->val;
    }
    
    void addAtHead(int val) {
        Node* node = new Node(val);
        Node* nxt = head->next;
        head->next = node;
        node->prev = head;
        node->next = nxt;
        nxt->prev = node;
        ++size;
    }
    
    void addAtTail(int val) {
        Node* node = new Node(val);
        Node* prev = tail->prev;
        prev->next = node;
        node->prev = prev;
        node->next = tail;
        tail->prev = node;
        ++size;
    }
    
    void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        Node* cur = head;
        for (int i = 0; i < index; ++i) cur = cur->next;
        Node* node = new Node(val);
        Node* nxt = cur->next;
        cur->next = node;
        node->prev = cur;
        node->next = nxt;
        nxt->prev = node;
        ++size;
    }
    
    void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        Node* cur = head->next;
        for (int i = 0; i < index; ++i) cur = cur->next;
        Node* p = cur->prev;
        Node* n = cur->next;
        p->next = n;
        n->prev = p;
        delete cur;
        --size;
    }
};
