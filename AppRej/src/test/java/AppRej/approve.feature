@COMMUNITY-1035
@REQ_COMMUNITY-3
Feature: Blog

	#Tests As an administrator , I want to be able to:
	#
	#*Acceptance Criteria:*
	#
	## View all blog posts (new and edited) in my dashboard
	## Reject/accept a post, by selecting the post and clicking on the
	#reject/accept button
	## A prompt (“Your post has been successfully approved and published.“ or “Your post has unfortunately been rejected because it doesn’t conform to the platform rules”) should be shown the user.
	@TEST_COMMUNITY-1049 @REQ_COMMUNITY-898 @TESTSET_COMMUNITY-1033
	Scenario: Approve or reject automation
		Given Admin logs in(admin)
		And goes to blog module(admin)
		And Admin clicks on approve(admin)

