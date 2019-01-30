class GitUtils {
    static String getRevision() {
        return sh(returnStdout: true, script: "git rev-list --count HEAD").trim()
    }
}