package lectures.p1unionfind;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UnionFindTest {

    private static final int N = 10;

    List<UnionFind> unionFinds;

    @Before
    public void setUp() throws Exception {
        unionFinds = Lists.newArrayList();
        unionFinds.addAll(Lists.newArrayList(
                new QuickFindUnionFind(N))
        );
    }

    @Test
    public void test1() throws Exception {
        for (UnionFind unionFind : unionFinds) {
            unionFind.union(1, 2);
            assertTrue(unionFind.connected(1, 2));
        }
    }

}
