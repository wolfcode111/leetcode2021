package interview;

/**
 * @Author:徐华东
 * @Date:2021/04/10:42
 * @Description:  实现一个 Trie (前缀树)，包含 insert, search, 和 startsWith 这三个操作。
 * Trie trie = new Trie();
 *
 * trie.insert("apple");
 * trie.search("apple");   // 返回 true
 * trie.search("app");     // 返回 false
 * trie.startsWith("app"); // 返回 true
 * trie.insert("app");
 * trie.search("app");     // 返回 true
 */
public class Trie {

    private TrieNode root;

    //初始化数据结构
    public Trie(){
        //初始化根节点
        root = new TrieNode();
    }

    //插入操作
    public void insert(String word){
        TrieNode node = this.root;
        //遍历
        for(char c : word.toCharArray()){
            if(node.children[c-'a'] == null){
                node.children[c-'a']=new TrieNode();
            }
            node=node.children[c-'a'];
        }
        node.item = word;
    }

    //查询操作
    public boolean search(String word){
        TrieNode node = this.root;
        //遍历
        for(char c : word.toCharArray()){
            if(node.children[c-'a']==null){
                return false;
            }
            node = node.children[c-'a'];
        }
        return node.item.equals(word);
    }

    //startWith前缀判断
    public boolean startWith(String prefix){
        TrieNode node = this.root;
        //遍历
        for(char c : prefix.toCharArray()){
            if(node.children[c-'a'] == null){
                return false;
            }
            node = node.children[c-'a'];
        }
        return true;
    }

}

class TrieNode{
    //孩子节点，分别记录26个字母
    TrieNode[] children = new TrieNode[26];
    //当前的节点（叶子节点）对应的单词
    String item = "";
}
