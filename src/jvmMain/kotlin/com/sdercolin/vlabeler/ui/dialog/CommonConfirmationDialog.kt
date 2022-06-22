package com.sdercolin.vlabeler.ui.dialog

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.sdercolin.vlabeler.ui.string.Strings
import com.sdercolin.vlabeler.ui.string.string

enum class CommonConfirmationDialogAction(
    val stringKey: Strings
) : EmbeddedDialogArgs {
    RemoveCurrentEntry(Strings.AskIfRemoveEntryDialogDescription)
}

data class CommonConfirmationDialogResult(
    val action: CommonConfirmationDialogAction,
) : EmbeddedDialogResult

@Composable
fun CommonConfirmationDialog(
    action: CommonConfirmationDialogAction,
    finish: (CommonConfirmationDialogResult?) -> Unit,
) {
    val dismiss = { finish(null) }
    val confirm = { finish(CommonConfirmationDialogResult(action)) }

    Column(Modifier.widthIn(min = 350.dp)) {
        Spacer(Modifier.height(15.dp))
        Text(
            text = string(action.stringKey),
            style = MaterialTheme.typography.body2,
            fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.height(25.dp))
        Row(modifier = Modifier.align(Alignment.End), horizontalArrangement = Arrangement.End) {
            TextButton(
                onClick = { dismiss() }
            ) {
                Text(string(Strings.CommonCancel))
            }
            Spacer(Modifier.width(25.dp))
            Button(
                onClick = { confirm() }
            ) {
                Text(string(Strings.CommonOkay))
            }
        }
    }
}

@Composable
@Preview
private fun Preview() = CommonConfirmationDialog(CommonConfirmationDialogAction.RemoveCurrentEntry) {}