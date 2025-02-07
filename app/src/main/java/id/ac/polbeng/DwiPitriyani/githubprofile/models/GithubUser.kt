package id.ac.polbeng.DwiPitriyani.githubprofile.models

import com.google.gson.annotations.SerializedName

data class GithubUser(

	@field:SerializedName("gists_url")
	val gistsUrl: String,

	@field:SerializedName("repos_url")
	val reposUrl: String,

	@field:SerializedName("user_view_type")
	val userViewType: String,

	@field:SerializedName("following_url")
	val followingUrl: String,

	@field:SerializedName("twitter_username")
	val twitterUsername: Any,

	@field:SerializedName("bio")
	val bio: Any,

	@field:SerializedName("created_at")
	val createdAt: String,

	@field:SerializedName("login")
	val login: String,

	@field:SerializedName("type")
	val type: String,

	@field:SerializedName("blog")
	val blog: String,

	@field:SerializedName("subscriptions_url")
	val subscriptionsUrl: String,

	@field:SerializedName("updated_at")
	val updatedAt: String,

	@field:SerializedName("site_admin")
	val siteAdmin: Boolean,

	@field:SerializedName("company")
	val company: Any,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("public_repos")
	val publicRepos: Int,

	@field:SerializedName("gravatar_id")
	val gravatarId: String,

	@field:SerializedName("email")
	val email: String,
)
