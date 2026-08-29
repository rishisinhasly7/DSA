class  Node{
    String url;
    Node next;
    Node prev;

    Node(String url){
        this.url = url;
    }
}
class BrowserHistory {

    Node curr;

    public BrowserHistory(String homepage) {
        Node node = new Node(homepage);
        curr = node;
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        curr.next  = newNode;
        newNode.prev = curr;
        curr = newNode;
    }
    
    public String back(int steps) {
        while(steps > 0 && curr.prev != null){
            curr = curr.prev;
            steps = steps -  1;
    } 
        return curr.url;
        
    }
    
    public String forward(int steps) {
        while(steps > 0 && curr.next != null){
            curr = curr.next;
            steps = steps -  1;
    } 
        return curr.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */