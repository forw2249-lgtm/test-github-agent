# Initialize local Git repository if not already present
git init

# Create a file named FirstLook.java in your project directory (or add it to existing one)
cat > FirstLook.java << EOM
public class FirstLook {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
    }
}
EOM

# Add the file to staging area in your local repository
git add FirstLook.java

# Commit with a message describing this as initial commit for production-ready code push
git commit -m "Initial Production-Ready Code: Push into test-github-agent"

# Set up remote, assuming you've created the 'test-github-agent' repository on GitHub already
git remote add origin https://github.com/your_username/test-github-agent.git

# Push code to your newly named repository with all files and history included (force push required if it exists)
git push -f --set-upstream origin master