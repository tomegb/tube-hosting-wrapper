import com.tube.hosting.java.tube.RestAccess;
import com.tube.hosting.java.tube.objects.Locale;
import com.tube.hosting.java.tube.requests.post.PostUserLocale;

public class Test {

  public static void main(String[] args) {
    RestAccess restAccess = new RestAccess(args[0], args[1]);
    PostUserLocale userLocale = new PostUserLocale(Locale.DE);
    userLocale.executeRequest(restAccess);
    System.out.println(userLocale.getStatusCode());
  }

}
