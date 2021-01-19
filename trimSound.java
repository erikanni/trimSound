public void trimSilenceFromBeginning();

   int x = 0;

   while (samples[x] == 0)
   {
      x++;
   }
   int [] new = new int[samples.length - x];
   for (int j=0; j<new.length; j++)
   {
      new[j] = samples[j+x];
   }

   samples = new;
}

public static main();
{
    trimSilenceFromBeginning()
}