package popmgr.interceptor;

import com.opensymphony.xwork2.*;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.*;

/**
 * Description
 * <br/> 用户验证拦截器
 * @author wang
 * @version 1.0
 * @email wws19125@126.com
 */

public class InterceptorAuthority 
    extends AbstractInterceptor
{
    public String intercept(ActionInvocation invocation)
	throws Exception
    {
	System.out.println("-------------------------用户登录验证拦截开始---------------------");
	ActionContext ctx = invocation.getInvocationContext();
	//System.out.println("name================="+ctx.getName());
	Map session = ctx.getSession();
	if(session.get("user")==null&&(!ctx.getName().equals("login")))
	    return Action.LOGIN;
	return invocation.invoke();
    }
}