package edu.uga.acm.osp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
<<<<<<< HEAD:BusApp/app/src/main/java/edu/uga/acm/osp/composables/NotificationDisplay.kt
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
=======
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons.Default
import androidx.compose.material.icons.filled.Alarm
import androidx.compose.material.icons.filled.BusAlert
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
>>>>>>> JQB-Front-End-Development:BusApp/app/src/main/java/edu/uga/acm/osp/components/NotificationDisplay.kt
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
<<<<<<< HEAD:BusApp/app/src/main/java/edu/uga/acm/osp/composables/NotificationDisplay.kt
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons.Default
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import edu.uga.acm.osp.ui.theme.BusAppTheme
=======
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Not used but could be applied for optimization
var titles = listOf("Notifications", "Status", "Remind")
val height = 225.sp
>>>>>>> JQB-Front-End-Development:BusApp/app/src/main/java/edu/uga/acm/osp/components/NotificationDisplay.kt

// How to use theme: BusAppTheme.colors.onB[whatever you need]
/**
 * Composes the entire Notification tab.
 */
@Preview(showBackground = false)
@Composable
fun NotificationComposable() {
    Box(
        modifier = Modifier
            .size(width = 500.dp, height = 220.dp)
            .padding(15.dp)
            //.paddingFromBaseline(50.dp, 50.dp)
    ) {
        Column(
            modifier = Modifier
                .height(400.dp)
                .background(color = BusAppTheme.colors.onBackgroundPrimary)
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            Row {
                Text(text = "Notifications", fontSize = 25.sp, fontWeight = FontWeight.Bold, modifier = Modifier
                    .offset(0.dp, -3.dp),
                    color = BusAppTheme.colors.onAccent
                )
                //Icon(Icons.iconCategory.iconName
                Row (
                    modifier = Modifier
                        .offset(25.dp, 5.dp)
                ){
                    DefaultIcon(imageVector = Default.Phone, contentDescription = "SMS Notifications")
                    Spacer(modifier = Modifier.padding(17.dp))
                    DefaultIcon(imageVector = Default.Email, contentDescription = "Email Notifications")
                    Spacer(modifier = Modifier.padding(17.dp))
                    //Need a better icon for APP
                    DefaultIcon(imageVector = Default.Person, contentDescription = "App Notifications")
                }

            }
            Row (modifier = Modifier
                .height(30.dp)
            ){
<<<<<<< HEAD:BusApp/app/src/main/java/edu/uga/acm/osp/composables/NotificationDisplay.kt
                DefaultIcon(imageVector = Default.ArrowForward, contentDescription = "Status Updates")
                Text(text = "Status Updates", fontSize = 15.sp, modifier = Modifier.offset(8.dp),
                    color = BusAppTheme.colors.onAccent)
=======
                DefaultIcon(imageVector = Default.BusAlert, contentDescription = "Status Updates")
                Text(text = "Status Updates", fontSize = 15.sp, modifier = Modifier.offset(8.dp))
>>>>>>> JQB-Front-End-Development:BusApp/app/src/main/java/edu/uga/acm/osp/components/NotificationDisplay.kt
                Spacer(modifier = Modifier.padding(15.dp))
                CheckboxLabelled()
                Spacer(modifier = Modifier.padding(5.dp))
                CheckboxLabelled()
                Spacer(modifier = Modifier.padding(5.dp))
                CheckboxLabelled()
            }
            Row (modifier = Modifier
                .height(30.dp)
            ) {
<<<<<<< HEAD:BusApp/app/src/main/java/edu/uga/acm/osp/composables/NotificationDisplay.kt
                DefaultIcon(imageVector = Default.Notifications, contentDescription = "Your Reminders")
                Text(text = "Your Reminders", fontSize = 15.sp, modifier = Modifier.offset(8.dp),
                    color = BusAppTheme.colors.onAccent)
=======
                DefaultIcon(imageVector = Default.Alarm, contentDescription = "Your Reminders")
                Text(text = "Your Reminders", fontSize = 15.sp, modifier = Modifier.offset(8.dp))
>>>>>>> JQB-Front-End-Development:BusApp/app/src/main/java/edu/uga/acm/osp/components/NotificationDisplay.kt
                Spacer(modifier = Modifier.padding(12.5.dp))
                CheckboxLabelled()
                Spacer(modifier = Modifier.padding(5.dp))
                CheckboxLabelled()
                Spacer(modifier = Modifier.padding(5.dp))
                CheckboxLabelled()
            }

        } // Col
    } // Card
} // NotifCom


/**
 * Creates an icon based on inputs.
 *
 * @param imageVector refers to the imagine in the default package
 * @param contentDescription supplies the accessibility caption
 */
@Composable
fun DefaultIcon(imageVector: ImageVector, contentDescription: String) {
    Icon(
        imageVector = imageVector,
        contentDescription = contentDescription,
        tint = BusAppTheme.colors.onAccent
    )
}
