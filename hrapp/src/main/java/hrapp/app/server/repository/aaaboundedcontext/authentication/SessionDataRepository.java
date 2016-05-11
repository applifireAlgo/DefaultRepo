package hrapp.app.server.repository.aaaboundedcontext.authentication;
import com.athena.server.repository.SearchInterface;
import com.spartan.server.interfaces.LoginSessionDataRepository;
import com.athena.annotation.Complexity;
import com.athena.annotation.SourceCodeAuthorClass;

@SourceCodeAuthorClass(createdBy = "sagar.jadhav@algorhythm.co.in", updatedBy = "", versionNumber = "1", comments = "Repository for SessionData Transaction table", complexity = Complexity.MEDIUM)
public interface SessionDataRepository<T> extends SearchInterface, LoginSessionDataRepository {
}