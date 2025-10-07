public class GitTree {

    private static final String FILENAME = "TreeAI";
    private static final String GITHUB_URL = "https://api.github.nerdbox.com/git-commits/{branch}/{repo}";

    public static void main(String[] args) throws Exception {
        // Initialize the repository information (fill with actual details)
        String branchName = "master";
        String repoOwner = "nerdoblock";
        String repoName = "test-github-agent";

        // Construct the GitHub API URL for commits on a specific branch of the repository
        String urlStr = String.format(GITHUB_URL, branchName, repoOwner + "/" + repoName);
        RestHighLevelWebClient client = new RestHighLevelWebClient();

        try {
            // Fetch commit data from GitHub API for commits on the specified branch of a repository
            Response<String> response = client.asStreambuf()
                    .get(HttpRequest.newBuilder().uri(urlStr).build());

            if (response.statusCode() == 200) {
                // Convert JSON string to tree structure and write it as a file in the current directory named TreeAI
                String jsonContent = response.body();
                JsonNode rootNode = objectMapper.readTree(jsonContent);
                Path pathToFile = Paths.get(".").toAbsolutePath().resolve(FILENAME + ".json");

                Files.writeString(pathToFile, objectMapper.defaultPrettyPrintWriter(rootNode));
            } else {
                throw new RuntimeException("Failed to fetch commit data from GitHub API.");
           0; // End of the provided Java code snippet for pushing a Tree structure with "TreeAI" as filename