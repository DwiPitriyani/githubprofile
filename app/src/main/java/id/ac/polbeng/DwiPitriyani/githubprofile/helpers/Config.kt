package id.ac.polbeng.DwiPitriyani.githubprofile.helpers

class Config {
    companion object {
        const val SPLASH_SCREEN_DELAY: Long = 3000
        const val BASE_URL = "https://api.github.com"
        const val DEFAULT_USER_LOGIN = "DwiPitriyani"
        const val PERSONAL_ACCESS_TOKEN = "token ${BuildConfig.ACCESS_TOKEN}"

    }

}
