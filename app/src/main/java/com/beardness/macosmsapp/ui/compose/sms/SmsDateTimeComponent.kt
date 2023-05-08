package com.beardness.macosmsapp.ui.compose.sms

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.beardness.macosmsapp.ui.theme.dimen.Dimens

@Composable
fun SmsDateTimeComponent(
    date: String,
    time: String,
) {
    val textColor = MaterialTheme.colorScheme.onSurface.copy(alpha = .3f)

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = Dimens.dp28,
                vertical = Dimens.dp4,
            ),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = date,
            style = MaterialTheme.typography.bodySmall,
            color = textColor,
        )

        Spacer(modifier = Modifier.weight(weight = 1f))

        Text(
            text = time,
            style = MaterialTheme.typography.bodySmall,
            color = textColor,
        )
    }
}