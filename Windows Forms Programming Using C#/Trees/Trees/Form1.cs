using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Trees
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            //tv.Nodes.Add("Raja");
            //tv.Nodes.Add("Shekar");
            //tv.Nodes.Add("Raja Shekar");
            //tv.Nodes[0].Nodes.Add("ss");
            //tv.Nodes[0].Nodes.Add("yy");
            //tv.Nodes[0].Nodes.Add("xx");
            //tv.Nodes[1].Nodes.Add("aa");
            //tv.Nodes[1].Nodes.Add("bb");
            //tv.Nodes[1].Nodes.Add("cc");
            //tv.Nodes[1].Nodes[0].Nodes.Add("sub sub");
            for (int i = 0; i <= 100; i++)
            {
                tv.Nodes.Add("Node " + i);
                for (int j = 0; j <= 100; j++)
                {
                    tv.Nodes[i].Nodes.Add("Node " + i + j);
                }
            }
        }

        private void btnParent_Click(object sender, EventArgs e)
        {
            tv.Nodes.Add(txtNode.Text);
        }

        private void btnChild_Click(object sender, EventArgs e)
        {
            tv.SelectedNode.Nodes.Add(txtNode.Text);
        }

        private void btnRemove_Click(object sender, EventArgs e)
        {
            tv.SelectedNode.Remove();
        }
    }
}
