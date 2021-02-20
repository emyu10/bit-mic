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
### 7. Describe DateTimePicker control with two methods.
### 8. Write difference between Modal and Modeless dialog boxes and give an example for each.
### 9. Describe any four methods of PrintDialog box.
### 10. Describe the steps to create custom dialog box.

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
### 3. Write a program to create a color mixture using NumericUpDown controls.
### 4. Explain any five Modal DialogBoxes with sample code to open those dialog boxes.
### 5. Explain ContextMenuStrip control and the four types of item in the ContextMenuStrip.