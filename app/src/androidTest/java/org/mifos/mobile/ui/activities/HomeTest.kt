package org.mifos.mobile.ui.activities

import androidx.test.espresso.Espresso
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.rule.GrantPermissionRule
import androidx.test.runner.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mifos.mobile.R
import org.mifos.mobile.utils.EspressoIdlingResouce

/**
 * UI Testing for Home Activity using Espresso
 *
 *
 * @author Ashwin Ramakrishnan
 * @since 22/08/2020
 */

@LargeTest
@RunWith(AndroidJUnit4::class)
class HomeTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(HomeActivity::class.java)

    @Rule
    @JvmField
    val grantPermissionRule: GrantPermissionRule =
        GrantPermissionRule.grant(android.Manifest.permission.READ_PHONE_STATE)

    @Before
    fun registerIdlingResource() {
        IdlingRegistry.getInstance().register(EspressoIdlingResouce.countingIdlingResource)
    }

    @After
    fun unregisterIdlingResource() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingResouce.countingIdlingResource)
    }

    @Test
    fun homeTest() {

        val accountsButton: ViewInteraction = getEspressoView(R.id.ll_accounts)

        val transferButton: ViewInteraction = getEspressoView(R.id.ll_transfer)

        val chargesButton: ViewInteraction = getEspressoView(R.id.ll_charges)

        val applyForLoanButton: ViewInteraction = getEspressoView(R.id.ll_apply_for_loan)

        val beneficiariesButton: ViewInteraction = getEspressoView(R.id.ll_beneficiaries)

        val notificationButton: ViewInteraction = getEspressoView(R.id.menu_notifications)

        val buttons: List<ViewInteraction> =
            listOf(
                notificationButton,
                accountsButton,
                transferButton,
                chargesButton,
                applyForLoanButton,
                beneficiariesButton
            )

        clickButtons(buttons)

    }
}

fun clickButtons(buttons: List<ViewInteraction>) {
    for (item in buttons) {
        item.perform(ViewActions.click())
        Espresso.pressBack()
    }
}

fun getEspressoView(id: Int): ViewInteraction {
    return Espresso.onView(ViewMatchers.withId(id))
}