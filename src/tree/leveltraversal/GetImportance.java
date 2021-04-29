package tree.leveltraversal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:徐华东
 * @Date:2021/04/10:20
 * @Description:  690. 员工的重要性
 */

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
public class GetImportance {

    Map<Integer,Employee> map = new HashMap<>();
    public int getImportance(List<Employee> employees, int id) {
        //我们先将这个数据结构进行一下转换，让我们直接定义一个Hash的结构
        //这样我们就可以通过id能够迅速的找到这个集合
        for(Employee e : employees) map.put(e.id,e);
        return dfs(id);
    }
    public int dfs(int id){

            Employee e =map.get(id);
            int ans = e.importance;
            for(Integer num : e.subordinates){
                ans+=dfs(num);
            }
            return ans;
    }

}
