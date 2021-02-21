# Section A
### 1. Describe any 4 properties of Form.
1. **AcceptButton**: If this is set, the specified button will be triggered when the user presses the enter key on the keyboard.
2. **CancelButton**: If this is set, the specified button will be triggered when the user presses the escape key on the keyboard.
3. **Text**: Used to give a caption to the form.
4. **WindowState**: Used to determine the initial state of the form. It has 3 options, normal, minimized and maximized.

### 2. Describe MouseMove event with parameter.
This event is fired when the mouse pointer is moved on top of a control. The event accepts 2 parameters, the object from which the event is fired and an object of MouseEventArgs which contains more information about the event.
```C#
private void Control_MouseMove(object sender, MouseEventArgs e)
{

}
```

### 3. Describe any four properties of ImageList box.
1. **ColorDepth**: Gets or sets the color depth of the image list.
2. **Images**: Gets the image collection of the image list component.
3. **ImageSize**: Get or sets the size of images in the image list.
4. **ImageStream**: Gets the ImageListStreamer associated with the image list.

### 4. Describe Control class with sample code.
The Control class is the parent class for all other classes which display information to the user. It has basic functionality which ease the implementation of other controls. It handles user input through keyboard and pointing devices. It handles message routing and security. It defines the basic properties of controls such as position and size. But it does not implement painting of the actual controls. It provides a window handle.
```C#
// creating a button and adding to a form
Button btnSubmit = new Button();
this.Controls.Add(btnSubmit);
```

### 5. Describe TextBox and DomainUpDown control.
A TextBox control is used to accept or display a single line of text. A user can type text or paste text in a text box control.

DomainUpDown control provides a spinner with predefined collection of strings. A string can be selected using the up and down arrow keys on the keyboard.

### 6. Explain about ProgressBar control with minimum and maximum property.
A ProgressBar can be used to show the progress of a lengthy process that is ongoing, like calculating a complex result or downloading a large file from the web. It is used whenever a process takes more than a short time to complete an operation. The minimum and maximum properties define the range of values to represent the progress of a task.

1. **Minimum**: Sets the lower value for the range of valid values for progress.
2. **Maximum**: Sets the upper value for the range of valid values for progress.
3. **Value**: Gets or sets the current level of the progress.

### 7. Describe DateTimePicker control with two methods.
DateTimePicker control allows you to display and collect date and time from the user with a specified format. The control has 2 parts, a label that displays the selected date and time and a popup calendar that allows user to select a new date. The most important property is the Value property, which holds the selected date and time.

1. **OnDropDown()**: Triggers when the drop-down calendar portion is shown.
2. **ToString()**: Returns a string that represent the selected date and time in the specified format.

### 8. Write difference between Modal and Modeless dialog boxes and give an example for each.
Modal dialog boxes forces the user to either choose a value or cancel the dialog box before he/she can interact with the application or form which instantiated the dialog box.
- Example: Open dialog box

Modeless dialog boxes enable the user to interact with the dialog and application interchangeably.
- Example: find and replace dialog box in MS Word.

### 9. Describe any four methods of PrintDialog box.
1. **ShowDialog()**: Shows the print dialog to the user to that the user can take an action on the dialog box. This method returns a DialogResult.
2. **Reset()**: Resets all options, the last selected printer and the page settings to their default values.
3. **Dispose(Boolean)**: Releases the unmanaged resources used by the component and optionally releases the managed resources.
4. **ToString()**: Returns a string containing the name of the component, if any.

### 10. Describe the steps to create custom dialog box.
Process of creating custom dialog boxes.
1. Add a form to your project by right clicking the project in the solution explorer, point to Add and then click Windows Form.
2. In the properties Window, change the FormBorderStyle property to FixedDialog.
3. Customize the appearance of the form, as required.
4. Add controls into this form.
5. Write code.

---

# Section B
### 1. Explain about Label with any four properties and four methods.
Labels are one of the most frequently used controls in Windows forms applications. It is used to display text on a form on a specific location. It is a way to add descriptive text to a form to provide the user with helpful information. The Label class is defined in System.Windows.Forms namespace.

Properties
1. **AutoSize**: Gets or sets a value indicating whether the control is automatically resized to display the entire contents.
2. **BorderStyle**: Gets or sets the border style of the label.
3. **Text**: Gets or sets the text displayed.
4. **TextAlign**: Gets or sets the alignment of text inside the label.

### 2. Explain any five properties and event of CheckedListBox.
Properties:
1. **CheckedIndices**: Collection of indices of the cheched items in the CheckedListBox.
2. **CheckedItems**: Collection of checked items in the CheckedListBox.
3. **CheckOnClick**: Lets users to check or uncheck elements by means of a single click. Gets or sets a value indicating whether the checkbox shoud be toggled when an item is selected.
4. **Items**: Gets the collection of items in the CheckListBox.
5. **MultiColumn**: Gets or sets a value indicating whether the CheckedListBox supports multiple columns.

Events:
1. **ItemCheck**: Occurs when the checked state of an item changes.
2. **SelecteIndexChanged**: Occurs when the index of the item selected is changed.
3. **SelectedValueChanged**: Occurs when the selected item is changed.
4. **MouseClick**: Occurs when the user clicks the CheckedListBox control with the mouse.
5. **Format**: Occurs when the control is bound to a data value.

### 3. Write a program to create a color mixture using NumericUpDown controls.
Steps:
- Start a new Windows Forms Application project.
- Add a Panel container to the form which will act as the color display. Name it panelDisplay.
- Add 3 NumericUpDown controls and name them udRed, udGreen and udBlue. Label the controls red, green and blue using Label controls.
- Set the min and max values of the NumericUpDown controls to 0 and 255 respectively.
- Write the following code
```C#
namespace ColorMixer
{
    public partial class Form1: Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void colorChanged(object sender, EventArgs e)
        {
            panelDisplay.BackColor = Color.FromArgb((int)udRed.Value, (int)udGreen.Value, (int)udBlue.Value);
        }
    }
}
```
- Set colorChanged event handler as the ValueChanged event of the three NumericUpDown controls and also the Load event of the form.
### 4. Explain any five Modal DialogBoxes with sample code to open those dialog boxes.
### 5. Explain ContextMenuStrip control and the four types of item in the ContextMenuStrip.